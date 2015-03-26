package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.MatchPO;
import PO.PlayerPO;
import PO.PlayerTechMPO;
import PO.TeamPO;
/*
 * ����ʼ�����ݿ�ʱ����
 */
public class SqlInitial {
	
	public static void main(String[] args){
		SqlInitial si = new SqlInitial();
		si.player();
	//	si.team();
	//	si.match();
	//	si.teamTech();
	//	si.playerTech();
	}
	
	DataToSQL dts = new DataProcessing();
	
	public void player(){
		ArrayList<PlayerPO> list = dts.playerRead();
	//	ArrayList<PlayerPO> list = new ArrayList<PlayerPO>();
		int size = list.size();
		//���������ݿ�
		//����������
		String driver = "com.mysql.jdbc.Driver";

		//URLָ��Ҫ���ʵ����ݿ���nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQL����ʱ���û���
		String user = "root";
		// Java����MySQL����ʱ������
		String password = "";
		try {
			// ������������
			Class.forName(driver);
			// �������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement����ִ��SQL���
			Statement statement = conn.createStatement();
			String sql = "insert into t_player values ";
			for(int i=0;i<size;i++){
				PlayerPO po = list.get(i);
				sql += "('"+po.name+"','"+po.uniformNum+"','"+po.position+"','"+po.height+"','"+po.weight+"','"+po.birth+"','"+po.age+"','"+po.age+"','"+po.exp+"','"+po.school+"')";
			}
			statement.executeUpdate(sql);
			conn.close();
		} catch(ClassNotFoundException e) {   
	        System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
        } catch(SQLException e) {   
	        e.printStackTrace();   
	    } catch(Exception e) {   
	        e.printStackTrace();   
     	}   
	}
	
	public void team(){
		ArrayList<TeamPO> list = dts.teamRead();
		int size = list.size();
		//���������ݿ�
		//����������
		String driver = "com.mysql.jdbc.Driver";

		//URLָ��Ҫ���ʵ����ݿ���nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQL����ʱ���û���
		String user = "root";
		// Java����MySQL����ʱ������
		String password = "";
		try {
			// ������������
			Class.forName(driver);
			// �������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement����ִ��SQL���
			Statement statement = conn.createStatement();
			String sql = "insert into t_team values ";
			for(int i=0;i<size;i++){
				TeamPO po = list.get(i);
				sql += "('"+po.fullName+"','"+po.abbreviation+"','"+po.location+"','"+po.division+"','"+po.partition+"','"+po.homeCourt+"','"+po.time+"') ";
			}
			statement.executeQuery(sql);
			conn.close();
		} catch(ClassNotFoundException e) {   
	        System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
        } catch(SQLException e) {   
	        e.printStackTrace();   
	    } catch(Exception e) {   
	        e.printStackTrace();   
     	}   
	}
	
	//matchPO����t_match��t_detail
	public void match(){
		String driver = "com.mysql.jdbc.Driver";

		//URLָ��Ҫ���ʵ����ݿ���nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQL����ʱ���û���
		String user = "root";
		// Java����MySQL����ʱ������
		String password = "";
		try {
			// ������������
			Class.forName(driver);
			// �������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement����ִ��SQL���
			Statement statement = conn.createStatement();
			
	    	ArrayList<MatchPO> list = dts.matchRead();
	    	int size = list.size();
	    	String sql2 = "insert into t_match values ";
	    	for(int i=0;i<size;i++){
	    		MatchPO temp = list.get(i);
	    		//����t_match
	    		sql2+="('"+temp.season+"','"+temp.date+"','"+temp.homeTeam+"','"+temp.guestTeam+"','"+temp.score+"','"+temp.score1+"','"+temp.score2+"','"+temp.score3
	    				+"','"+temp.score4+"','"+temp.scoreExtra+"','"+temp.ifHomeTeamWin+"','"+temp.ifGuestTeamWin+"','"+temp.homeTeamDeffensiveRebound+"','"+temp.guestTeamDeffensiveRebound+"','"+
	    				temp.homeTeamOffensiveRebound+"','"+temp.guestTeamOffensiveRebound+"','"+temp.homeTeamOffensiveRound+"','"+temp.guestTeamOffensiveRound+"','"+temp.homeScore+"','"+temp.guestScore
	    				+"','"+temp.homeAllTime+"','"+temp.guestAllTime+"','"+temp.homeShotIn+"','"+temp.guestShotIn+"','"+temp.homeTwoShot+"','"+temp.guestTwoShot+"','"+temp.homeShot+"','"+temp.guestShot+"','"+
	    				temp.homePenaltyShot+"','"+temp.guestPenaltyShot+"','"+temp.homeFoul+"','"+temp.guestFoul+"') ";
	    		
	    		//����t_detail
		    	ArrayList<PlayerTechMPO> mpoList = temp.playerStatistic;
		    	int n = mpoList.size();
		    	String sql1 = "insert into t_detail values ";
		    	for(int j=0;j<n;j++){
			    	PlayerTechMPO mpo = mpoList.get(j);
			    	sql1+="('"+mpo.name+"','"+mpo.team+"','"+temp.season+"','"+mpo.position+"','"+mpo.time+"','"+
		         		mpo.shotIn+"','"+mpo.shot+"','"+mpo.threeShotIn+"','"+mpo.threeShot+"','"+mpo.penaltyShotIn+"','"+mpo.penaltyShot+"','"+
						mpo.offensiveRebound+"','"+mpo.defensiveRebound+"','"+mpo.rebound+"','"+mpo.secondaryAttack+"','"+mpo.steal+"','"+
			        	mpo.blockShot+"','"+mpo.fault+"','"+mpo.foul+"','"+mpo.score+"','"+mpo.ifFirstLineUp+"','"+mpo.ifParticipate+"') ";
		     	}
			    statement.executeQuery(sql1);
	    	}
	    	statement.execute(sql2);
	    	conn.close();
		}catch(ClassNotFoundException e) {   
	        System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
        } catch(SQLException e) {   
	        e.printStackTrace();   
	    } catch(Exception e) {   
	        e.printStackTrace();   
     	}
	}
	
	//����TeamTechPO,�������ظ�ʹ�õĲ�ѯ��䣬���Ż���
	public void teamTech(){
		String teamName = "";                            //�������
		String season = "";                          //����
		int gameNum = 0;                         //��������
		int shotInNum = 0;                       //Ͷ��������
		int shotNum = 0;                         //Ͷ��������
		int threeShotInNum = 0;                  //����������
		int threeShotNum = 0;                    //���ֳ�����
		int twoShotInNum = 0;
		int twoShotNum = 0;
		int penaltyShotInNum = 0;                //����������
		int penaltyShotNum = 0;                  //���������
		int offensiveRebound = 0;                //ǰ��������
		int defensiveRebound = 0;                //��������
		int rebound = 0;                         //��������
		int fault = 0;                           //ʧ����
		
		int secondaryAttack = 0;                 //������
	    int steal = 0;                           //������
		int blockShot = 0;                       //��ñ��
		int foul = 0;                            //������
		
		int score = 0;                           //�����÷�
		double shotInRate = 0;                      //Ͷ��������
		double threeShotInRate = 0;                 //����������
		double penaltyShotInRate = 0;               //����������
		double winningRate = 0;                     //ʤ��	
		int winningNum = 0;                         //ʤ����
		double offensiveRound = 0;                  //�����غ�
		double offensiveEfficiency = 0;               //����Ч��
		double defensiveEfficiency = 0;               //����Ч��
		double reboundEfficiency = 0;                 //����Ч��
		double stealEfficiency = 0;                   //����Ч��
		double secondaryAttackEfficiency = 0;         //����Ч��
		int opponentDefensiveRebound = 0;          //�Է���������
		int opponentOffensiveRebound = 0;          //�Է���������
		double opponentOffensiveRound = 0;        //�Է������غ�
		int opponentScore = 0;        //�Է��÷�
		
		//���������ݿ�
		//����������
		String driver = "com.mysql.jdbc.Driver";
		//URLָ��Ҫ���ʵ����ݿ���nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQL����ʱ���û���
		String user = "root";
		// Java����MySQL����ʱ������
		String password = "";
		try {
			// ������������
			Class.forName(driver);
			// �������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement����ִ��SQL���
			Statement statement = conn.createStatement();
			String sql = "insert into t_seasondata values ";
	
			ResultSet rs1 = statement.executeQuery("select homeTeam,season, NUM(homeShotIn),NUM(homeShot),NUM(homeTwoShotIn),NUM(homeTwoShot),NUM(homePenaltyShotIn),NUM(homePenaltyShot),"
					+ "NUM(homeOffensiveRebound),NUM(homeDefensiveRebound),NUM(homeFoul),NUM(homeScore),NUM(ifHomeTeamWin),NUM(homeTeamOffensiveRound),NUM(guestDefensiveRebound),"
					+ "NUM(guestOffensiveRebound),NUM(guestOffensiveRound),NUM(guestScore) from t_seansondata GROUP BY homeTeam)");
			while(rs1.next()){
				teamName = new String(rs1.getString(0).getBytes("ISO-8859-1"),"utf-8");
				ResultSet rs4 = statement.executeQuery("select COUNT(homeTeam) from t_match where homeTeam='"+teamName+"'");
				ResultSet rs5 = statement.executeQuery("select COUNT(guestTeam) from t_match where guestTeam='"+teamName+"'");
				gameNum = rs4.getInt(0)+rs5.getInt(0);
				season = new String(rs1.getString(1).getBytes("ISO-8859-1"),"utf-8");
				shotInNum = rs1.getInt(2);
				shotNum = rs1.getInt(3);
				twoShotInNum = rs1.getInt(4);
				twoShotNum = rs1.getInt(5);
				penaltyShotInNum = rs1.getInt(6);
				penaltyShotNum = rs1.getInt(7);
				offensiveRebound = rs1.getInt(8);
				defensiveRebound = rs1.getInt(9);
				fault = rs1.getInt(10);
				score = rs1.getInt(11);
				winningNum = rs1.getInt(12);
				offensiveRound = rs1.getInt(13);
				opponentDefensiveRebound = rs1.getInt(14);
				opponentOffensiveRebound = rs1.getInt(15);
				opponentOffensiveRound = rs1.getDouble(16);
				opponentScore = rs1.getInt(17);
				ResultSet rs2 = statement.executeQuery("select * from (select guestTeam, NUM(guestShotIn),NUM(guestShot),NUM(guestTwoShotIn),NUM(guestTwoShot),NUM(guestPenaltyShotIn),NUM(guestPenaltyShot),"
						+ "NUM(guestOffensiveRebound),NUM(guestDefensiveRebound),NUM(guestFoul),NUM(guestScore),NUM(ifGuestTeamWin),NUM(guestTeamOffensiveRound),NUM(homeDefensiveRebound),"
						+ "NUM(homeOffensiveRebound),NUM(homeOffensiveRound),NUM(homeScore) from t_seansondata GROUP BY (guestTeam)) where guestTeam='"+teamName+"'");
				while(rs2.next()){
					shotInNum += rs2.getInt(2);
					shotNum += rs2.getInt(3);
					twoShotInNum += rs2.getInt(4);
					twoShotNum += rs2.getInt(5);
					penaltyShotInNum += rs2.getInt(6);
					penaltyShotNum += rs2.getInt(7);
					offensiveRebound += rs2.getInt(8);
					defensiveRebound += rs2.getInt(9);
					fault += rs2.getInt(10);
					score += rs2.getInt(11);
					winningNum += rs2.getInt(12);
					offensiveRound += rs2.getInt(13);
					opponentDefensiveRebound += rs2.getInt(14);
					opponentOffensiveRebound += rs2.getInt(15);
					opponentOffensiveRound += rs2.getDouble(16);
					opponentScore += rs2.getInt(17);
				}
				threeShotInNum = shotInNum - twoShotInNum;
				threeShotNum = shotNum - twoShotNum;
				rebound = offensiveRebound+defensiveRebound;
		
				ResultSet rs3 = statement.executeQuery("select * from(select team, NUM(secondaryAttack),NUM(steal),NUM(blockShot),NUM(foul) from t_detail GROUP BY (team)) where team='"+teamName+"'");
				while(rs3.next()){
					secondaryAttack = rs3.getInt(1);
					steal = rs3.getInt(2);
					blockShot = rs3.getInt(3);
					foul = rs3.getInt(4);
				}
			}
		    sql+="('"+teamName+"','"+season+"','"+gameNum+"','"+shotInNum+"','"+shotNum+"','"+threeShotInNum+"','"+threeShotNum+"','"+penaltyShotInNum+"','"+
		    penaltyShotNum+"','"+offensiveRebound+"','"+defensiveRebound+"','"+rebound+"','"+secondaryAttack+"','"+steal+"','"+blockShot+"','"+fault+"','"+
		    		foul+"','"+score+"','"+shotInRate+"','"+threeShotInRate+"','"+penaltyShotInRate+"','"+winningRate+"','"+winningNum+"','"+offensiveRound+"','"
		    +offensiveEfficiency+"','"+defensiveEfficiency+"','"+reboundEfficiency+"','"+stealEfficiency+"','"+secondaryAttackEfficiency+"','"+opponentDefensiveRebound+"','"+
		    		opponentOffensiveRebound+"','"+opponentOffensiveRound+"','"+opponentScore+"') ";
		
			statement.executeUpdate(sql);
			conn.close();
		}catch(ClassNotFoundException e) {   
			System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
	    } catch(SQLException e) {   
	    	e.printStackTrace();   
    	} catch(Exception e) {   
	        e.printStackTrace();   
	    }   
	}

	//����PlayerTechPO
	public void playerTech(){
		String name = "";                            //��Ա����
		String season = "";                          //����
		String team = "";                            //�������
		int gameNum = 0;                         //��������
		int startingNum = 0;                     //�ȷ�����
		int rebound = 0;                         //������
		int secondaryAttack = 0;                 //������
		int time = 0;                            //�ڳ�ʱ��
		double shotInRate = 0;                      //Ͷ��������
		double threeShotInRate = 0;                 //����������
		double penaltyShotInRate = 0;               //����������
		int offensiveNum = 0;                    //������
		int defensiveNum = 0;                    //������
		int steal = 0;                           //������
		int blockShot = 0;                       //��ñ��
		int fault = 0;                           //ʧ����
		int foul = 0;                            //������
		int score = 0;                           //�÷�
		double efficiency = 0;                        //Ч��
		double GmScEfficiency = 0;                    //GmScЧ��ֵ
		double trueShotInRate = 0;                  //��ʵ������
		double shootingEfficiency = 0;                //Ͷ��Ч��
		double reboundRate = 0;                     //������
		double offensiveReboundRate = 0;            //����������
		double defensiveReboundRate = 0;            //����������
		double secondaryAttackRate = 0;             //������
		double stealRate = 0;                       //������
		double blockShotRate = 0;                   //��ñ��
		double faultRate = 0;                       //ʧ����	
		double usageRate = 0;                       //ʹ����
		int shotIn = 0;                       //Ͷ��������
		int shot = 0;                         //Ͷ��������
		int threeShotIn = 0;                  //����������
		int threeShot = 0;                    //���ֳ�����
		int penaltyShotIn = 0;                //����������
		int penaltyShot = 0;                  //���������
		int teamAllTime = 0;                  //ȫ���ϳ�ʱ��
		int teamOffensiveRebound = 0;                  //ȫ�ӽ�������
		int teamDefensiveRebound = 0;                //ȫ�ӷ�������
		int opponentOffensiveRebound = 0;                  //���ֽ�������
		int opponentDefensiveRebound = 0;                //���ַ�������
		int teamShotIn = 0;                             //ȫ�ӽ�����
		int opponentOffensiveNum = 0;                     //���ֽ�������
		int opponentTwoShot = 0;                     //������������ִ���
		int teamShot = 0;                          //ȫ�ӳ��ִ���
		int teamPenaltyShot = 0;                   //ȫ�ӷ������
		int teamFault = 0;                          //ȫ��ʧ�����  
		
		//���������ݿ�
		//����������
		String driver = "com.mysql.jdbc.Driver";
		//URLָ��Ҫ���ʵ����ݿ���nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQL����ʱ���û���
		String user = "root";
		// Java����MySQL����ʱ������
		String password = "";
		try {
			// ������������
			Class.forName(driver);
			// �������ݿ�
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement����ִ��SQL���
			Statement statement = conn.createStatement();
		
			String sql = "insert into t_playerdata values ";
			ResultSet rs1 = statement.executeQuery("select name, season, team, NUM(ifParticipate),NUM(ifFirstLineUp),NUM(rebound),"
					+ "NUM(secondaryAttack),NUM(time),NUM(offensiveRebound),NUM(defensiveRebound),NUM(steal),NUM(blockShot),NUM(fault),NUM(foul),"
					+ "NUM(score),NUM(shotIn),NUM(shot),NUM(threeShotIn),NUM(threeShot),NUM(penaltyShotIn),NUM(penaltyShot) GROUP BY(name)");
			while(rs1.next()){
				name = new String(rs1.getString(0).getBytes("ISO-8859-1"),"utf-8");
				season = new String(rs1.getString(1).getBytes("ISO-8859-1"),"utf-8");
				team = new String(rs1.getString(2).getBytes("ISO-8859-1"),"utf-8");
				gameNum = rs1.getInt(3);
				startingNum = rs1.getInt(4);
				rebound = rs1.getInt(5);
				secondaryAttack = rs1.getInt(6);
				time = rs1.getInt(7);
				offensiveNum = rs1.getInt(8);
				defensiveNum = rs1.getInt(9);
				steal = rs1.getInt(10);
				blockShot = rs1.getInt(11);
				fault = rs1.getInt(12);
				foul = rs1.getInt(13);
				score = rs1.getInt(14);
				shotIn = rs1.getInt(15);
				shot = rs1.getInt(16);
				threeShotIn = rs1.getInt(17);
				threeShot = rs1.getInt(18);
				penaltyShotIn = rs1.getInt(19);
				penaltyShot = rs1.getInt(20);
				ResultSet rs2 = statement.executeQuery("select * from(select homeTeam,NUM(homeAllTime),NUM(homeTeamOffensiveRebound),NUM(homeTeamDefensiveRebound),NUM(guestTeamOffensiveRebound),"
						+ "NUM(guestTeamDefensiveRebound),NUM(homeShotIn),NUM(guestTeamOffensiveRound),NUM(guestTwoShot),NUM(homeShot),NUM(homePenaltyShot),"
						+ "NUM(homeFoul) from t_match GROUP BY homeTeam) where homeTeam='"+team+"'");
				ResultSet rs3 = statement.executeQuery("select * from(select guestTeam,NUM(guestAllTime),NUM(guestTeamOffensiveRebound),NUM(guestTeamDefensiveRebound),NUM(homeTeamOffensiveRebound),"
						+ "NUM(homeTeamDefensiveRebound),NUM(guestShotIn),NUM(homeTeamOffensiveRound),NUM(homeTwoShot),NUM(guestShot),NUM(guestPenaltyShot),"
						+ "NUM(guestFoul) from t_match GROUP BY guestTeam) where guestTeam='"+team+"'");
				while(rs2.next()){
					teamAllTime = rs2.getInt(1);
					teamOffensiveRebound = rs2.getInt(2);
					teamDefensiveRebound = rs2.getInt(3);
					opponentOffensiveRebound = rs2.getInt(4);
					opponentDefensiveRebound = rs2.getInt(5);
					teamShotIn = rs2.getInt(6);
					opponentOffensiveNum = rs2.getInt(7);
					opponentTwoShot = rs2.getInt(8);
					teamShot = rs2.getInt(9);
					teamPenaltyShot = rs2.getInt(10);
					teamFault = rs2.getInt(11);
				}
				while(rs3.next()){
					teamAllTime += rs3.getInt(1);
					teamOffensiveRebound += rs3.getInt(2);
					teamDefensiveRebound += rs3.getInt(3);
					opponentOffensiveRebound += rs3.getInt(4);
					opponentDefensiveRebound += rs3.getInt(5);
					teamShotIn += rs3.getInt(6);
					opponentOffensiveNum += rs3.getInt(7);
					opponentTwoShot += rs3.getInt(8);
					teamShot += rs3.getInt(9);
					teamPenaltyShot += rs3.getInt(10);
					teamFault += rs3.getInt(11);
				}
			sql+="('"+name+"','"+season+"','"+team+"','"+gameNum+"','"+startingNum+"','"+rebound+"','"+secondaryAttack+"','"+time+"','"+shotInRate+"','"+threeShotInRate+"','"+penaltyShotInRate+"','"+offensiveNum+"','"+defensiveNum+"','"+steal+"','"+blockShot+"','"+fault+"','"+foul+"','"+score+"','"+
					efficiency+"','"+GmScEfficiency+"','"+trueShotInRate+"','"+shootingEfficiency+"','"+reboundRate+"','"+offensiveReboundRate+"','"+defensiveReboundRate+"','"+secondaryAttackRate+"','"+stealRate+"','"+blockShotRate+"','"+faultRate+"','"+usageRate+"','"+shotIn+"','"+shot+"','"+threeShotIn+"','"+threeShot+"','"+penaltyShotIn+"','"+penaltyShot+"','"+teamAllTime+"','"+teamOffensiveRebound
				+"','"+teamDefensiveRebound+"','"+opponentOffensiveRebound+"','"+opponentDefensiveRebound+"','"+teamShotIn+"','"+opponentOffensiveNum+"','"+opponentTwoShot+"','"+teamShot+"','"+teamPenaltyShot+"','"+teamFault+"') ";
			}
			statement.executeUpdate(sql);
			conn.close();
		}catch(ClassNotFoundException e) {   
			System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
	    } catch(SQLException e) {   
	    	e.printStackTrace();   
    	} catch(Exception e) {   
	        e.printStackTrace();   
	    }  
	}
}


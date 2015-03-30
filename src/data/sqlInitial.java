package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.MatchPO;
import PO.PlayerPO;
import PO.PlayerTechMPO;
import PO.TeamPO;
/*
 * ä¾›åˆå§‹åŒ–æ•°æ®åº“æ—¶è°ƒç”¨
 */
public class sqlInitial {
	DataToSQL dts = new DataProcessing();
<<<<<<< HEAD:src/data/SqlInitial.java
=======
	
	//playerºÍteamÊ¹ÓÃÆÕÍ¨²åÈë·½Ê½£¬´ıÓÅ»¯
>>>>>>> parent of 4c8e36c... æ•°æ®åº“ä¼˜åŒ–:src/data/sqlInitial.java
	public void player(){
		ArrayList<PlayerPO> list = dts.playerRead();
		int size = list.size();
		//è¿æ¥è‡³æ•°æ®åº“
		//é©±åŠ¨ç¨‹åºå
		String driver = "com.mysql.jdbc.Driver";

		//URLæŒ‡å‘è¦è®¿é—®çš„æ•°æ®åº“ånba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQLé…ç½®æ—¶çš„ç”¨æˆ·å
		String user = "root";
		// Javaè¿æ¥MySQLé…ç½®æ—¶çš„å¯†ç 
		String password = "";
		try {
			// åŠ è½½é©±åŠ¨ç¨‹åº
			Class.forName(driver);
			// è¿ç»­æ•°æ®åº“
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statementç”¨æ¥æ‰§è¡ŒSQLè¯­å¥
			Statement statement = conn.createStatement();
			
			for(int i=0;i<size;i++){
				PlayerPO po = list.get(i);
<<<<<<< HEAD:src/data/SqlInitial.java
				String sql = "insert t_player (name,uniformNum,position,height,weight,birth,age,exp,school) values ('"+po.name+"','"+po.uniformNum+"','"+po.position+"','"+po.height+"','"+po.weight+"','"+po.birth+"','"+po.age+"','"+po.age+"','"+po.exp+"','"+po.school+"')";
=======
				String sql = "insert into t_player (name,uniformNum,position,height,weight,birth,age,exp,school) values ('"+po.name+"','"+po.uniformNum+"','"+po.position+"','"+po.height+"','"+po.weight+"','"+po.birth+"','"+po.age+"','"+po.age+"','"+po.exp+"','"+po.school+"')";
>>>>>>> parent of 4c8e36c... æ•°æ®åº“ä¼˜åŒ–:src/data/sqlInitial.java
				statement.executeQuery(sql);
			}
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
		//è¿æ¥è‡³æ•°æ®åº“
		//é©±åŠ¨ç¨‹åºå
		String driver = "com.mysql.jdbc.Driver";

		//URLæŒ‡å‘è¦è®¿é—®çš„æ•°æ®åº“ånba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQLé…ç½®æ—¶çš„ç”¨æˆ·å
		String user = "root";
		// Javaè¿æ¥MySQLé…ç½®æ—¶çš„å¯†ç 
		String password = "";
		try {
			// åŠ è½½é©±åŠ¨ç¨‹åº
			Class.forName(driver);
			// è¿ç»­æ•°æ®åº“
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statementç”¨æ¥æ‰§è¡ŒSQLè¯­å¥
			Statement statement = conn.createStatement();
			
			for(int i=0;i<size;i++){
				TeamPO po = list.get(i);
<<<<<<< HEAD:src/data/SqlInitial.java
				String sql = "insert t_team (fullName,abbreviation,location,division,partition,homeCourt,time) values ('"+po.fullName+"','"+po.abbreviation+"','"+po.location+"','"+po.division+"','"+po.partition+"','"+po.homeCourt+"','"+po.time+"')";
=======
				String sql = "insert into t_team (fullName,abbreviation,location,division,partition,homeCourt,time) values ('"+po.fullName+"','"+po.abbreviation+"','"+po.location+"','"+po.division+"','"+po.partition+"','"+po.homeCourt+"','"+po.time+"')";
>>>>>>> parent of 4c8e36c... æ•°æ®åº“ä¼˜åŒ–:src/data/sqlInitial.java
				statement.executeQuery(sql);
			}
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
	
	public void match(){
		ArrayList<MatchPO> list = dts.matchRead();
		int size = list.size();
		for(int i=0;i<size;i++){
			ArrayList<PlayerTechMPO> mpoList = list.get(i).playerStatistic;
			int n = mpoList.size();
			
<<<<<<< HEAD:src/data/SqlInitial.java
		}
	
	}

=======
	    	ArrayList<MatchPO> list = dts.matchRead();
	    	int size = list.size();
	    	String sql2 = "insert into t_match values ";
	    	for(int i=0;i<size;i++){
	    		MatchPO temp = list.get(i);
	    		//Éú³Ét_match
	    		sql2=sql2+"("+temp.season+","+temp.date+","+temp.homeTeam+","+temp.guestTeam+","+temp.score+","+temp.score1+","+temp.score2+","+temp.score3
	    				+","+temp.score4+","+temp.scoreExtra+","+temp.ifHomeTeamWin+","+temp.ifGuestTeamWin+","+temp.homeTeamDeffensiveRebound+","+temp.guestTeamDeffensiveRebound+","+
	    				temp.homeTeamOffensiveRebound+","+temp.guestTeamOffensiveRebound+","+temp.homeTeamOffensiveRound+","+temp.guestTeamOffensiveRound+","+temp.homeScore+","+temp.guestScore
	    				+","+temp.homeAllTime+","+temp.guestAllTime+","+temp.homeShotIn+","+temp.guestShotIn+","+temp.homeTwoShot+","+temp.guestTwoShot+","+temp.homeShot+","+temp.guestShot+","+
	    				temp.homePenaltyShot+","+temp.guestPenaltyShot+","+temp.homeFoul+","+temp.guestFoul+") ";
	    		
	    		//Éú³Ét_detail
		    	ArrayList<PlayerTechMPO> mpoList = temp.playerStatistic;
		    	int n = mpoList.size();
		    	String sql1 = "insert into t_detail values ";
		    	for(int j=0;j<n;j++){
			    	PlayerTechMPO mpo = mpoList.get(j);
			    	sql1=sql1+"("+mpo.name+","+mpo.team+","+temp.season+","+mpo.position+","+mpo.time+","+
		         		mpo.shotIn+","+mpo.shot+","+mpo.threeShotIn+","+mpo.threeShot+","+mpo.penaltyShotIn+","+mpo.penaltyShot+","+
						mpo.offensiveRebound+","+mpo.defensiveRebound+","+mpo.rebound+","+mpo.secondaryAttack+","+mpo.steal+","+
			        	mpo.blockShot+","+mpo.fault+","+mpo.foul+","+mpo.score+","+mpo.ifFirstLineUp+","+mpo.ifParticipate+") ";
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
	
	//Éú³ÉTeamTechPO,´ıÓÅ»¯
	public void teamTech(){
		String teamName = "";                            //Çò¶ÓÃû³Æ
		String season = "";                          //Èü¼¾
		int gameNum = 0;                         //±ÈÈü³¡Êı
		int shotInNum = 0;                       //Í¶ÀºÃüÖĞÊı
		int shotNum = 0;                         //Í¶Àº³öÊÖÊı
		int threeShotInNum = 0;                  //Èı·ÖÃüÖĞÊı
		int threeShotNum = 0;                    //Èı·Ö³öÊÖÊı
		int twoShotInNum = 0;
		int twoShotNum = 0;
		int penaltyShotInNum = 0;                //·£ÇòÃüÖĞÊı
		int penaltyShotNum = 0;                  //·£Çò³öÊÖÊı
		int offensiveRebound = 0;                //Ç°³¡Àº°åÊı
		int defensiveRebound = 0;                //ºó³¡Àº°åÊı
		int rebound = 0;                         //×ÜÀº°åÊı
		int secondaryAttack = 0;                 //Öú¹¥Êı
	    int steal = 0;                           //ÇÀ¶ÏÊı
		int blockShot = 0;                       //¸ÇÃ±Êı
		int fault = 0;                           //Ê§ÎóÊı
		int foul = 0;                            //·¸¹æÊı
		int score = 0;                           //±ÈÈüµÃ·Ö
	/*	double shotInRate = 0;                      //Í¶ÀºÃüÖĞÂÊ
		double threeShotInRate = 0;                 //Èı·ÖÃüÖĞÂÊ
		double penaltyShotInRate = 0;               //·£ÇòÃüÖĞÂÊ
		double winningRate = 0;                     //Ê¤ÂÊ
	*/
		int winningNum = 0;                         //Ê¤³¡Êı
		double offensiveRound = 0;                  //½ø¹¥»ØºÏ
	/*	double offensiveEfficiency = 0;               //½ø¹¥Ğ§ÂÊ
		double defensiveEfficiency = 0;               //·ÀÊØĞ§ÂÊ
		double reboundEfficiency = 0;                 //Àº°åĞ§ÂÊ
		double stealEfficiency = 0;                   //ÇÀ¶ÏĞ§ÂÊ
		double secondaryAttackEfficiency = 0;         //Öú¹¥Ğ§ÂÊ
	*/
		int opponentDefensiveRebound = 0;          //¶Ô·½·ÀÊØÀº°å
		int opponentOffensiveRebound = 0;          //¶Ô·½½ø¹¥Àº°å
		double opponentOffensiveRound = 0;        //¶Ô·½½ø¹¥»ØºÏ
		int opponentScore = 0;        //¶Ô·½µÃ·Ö
		
		//Á¬½ÓÖÁÊı¾İ¿â
		//Çı¶¯³ÌĞòÃû
		String driver = "com.mysql.jdbc.Driver";
		//URLÖ¸ÏòÒª·ÃÎÊµÄÊı¾İ¿âÃûnba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQLÅäÖÃÊ±µÄÓÃ»§Ãû
		String user = "root";
		// JavaÁ¬½ÓMySQLÅäÖÃÊ±µÄÃÜÂë
		String password = "";
		try {
			// ¼ÓÔØÇı¶¯³ÌĞò
			Class.forName(driver);
			// Á¬ĞøÊı¾İ¿â
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statementÓÃÀ´Ö´ĞĞSQLÓï¾ä
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("select distinct homeTeam,season from t_match");
			//°¤¸ö´¦ÀíÃ¿Ò»Ö»Çò¶Ó
			String sql = "insert into t_seasondata values ";
			while(rs.next()){
				teamName = rs.getString(0);
				season = rs.getString(1);
				ResultSet rs1 = statement.executeQuery("select COUNT(*) as num from t_match where homeTeam='"+teamName+"'");
				while(rs1.next())
					gameNum = rs1.getInt("num");
				ResultSet rs2 = statement.executeQuery("select COUNT(*) as num from t_match where guestTeam='"+teamName+"'");
				while(rs2.next())
					gameNum+=rs2.getInt("num");
				
			    ResultSet rs3 = statement.executeQuery("select NUM(homeShotInNum),NUM(homeShotNum),NUM(homeTwoShotInNum),NUM(homeTwoShotNum),NUM(homePenaltyShotInNum),NUM(homePenaltyShotNum),"
			    		+ "NUM(homeOffensiveRebound),NUM(homeDefensiveRebound),NUM(homeScore) where homeTeam='"+teamName+"'");
			    while(rs3.next()){
			    	shotInNum = rs3.getInt("0");
			    	shotNum = rs3.getInt(1);
			    	twoShotInNum = rs3.getInt(2);
			    	twoShotNum = rs3.getInt(3);
			    	penaltyShotInNum = rs3.getInt(4);
			    	penaltyShotNum = rs3.getInt(5);
			    	offensiveRebound = rs3.getInt(6);
			    	defensiveRebound = rs3.getInt(7);
			    	score = rs3.getInt(8);
			    }
			    ResultSet rs4 = statement.executeQuery("select NUM(guestShotInNum),NUM(guestShotNum),NUM(guestTwoShotInNum),NUM(guestTwoShotNum),NUMguestPenaltyShotInNum),NUM(guestPenaltyShotNum),"
			    		+ "NUM(guestOffensiveRebound),NUM(guestDefensiveRebound),NUM(guestScore) where guestTeam='"+teamName+"'");
			    while(rs4.next()){
			    	shotInNum += rs4.getInt("0");
			    	shotNum += rs4.getInt(1);
			    	twoShotInNum += rs4.getInt(2);
			    	twoShotNum += rs4.getInt(3);
			    	penaltyShotInNum += rs4.getInt(4);
			    	penaltyShotNum += rs4.getInt(5);
			    	offensiveRebound += rs4.getInt(6);
			    	defensiveRebound += rs4.getInt(7);
			    	score += rs4.getInt(8);
			    }
			    rebound = offensiveRebound + defensiveRebound;
			    threeShotInNum = shotInNum - twoShotInNum;
			    threeShotNum = shotNum - twoShotNum;
			    //±éÀúdetail£¬ÕÒµ½ÊôÓÚ¸Ã¶ÓµÄÇòÔ±Êı¾İ
			    ResultSet rs5 = statement.executeQuery("select NUM(secondaryAttack),NUM(steal),NUM(blockShot),NUM(fault),NUM(foul) from t_detail where abbreviation='"+teamName+"'");
			    while(rs5.next()){
			    	secondaryAttack = rs5.getInt(0);
			    	steal = rs5.getInt(1);
			    	blockShot = rs5.getInt(2);
			    	fault = rs5.getInt(3);
			    	foul = rs5.getInt(4);
			    }
			    ResultSet rs6 = statement.executeQuery("select NUM(ifHomeTeamWin) from t_match where homeTeam='"+teamName+"'");
			    while(rs6.next())
			    	winningNum = rs6.getInt(0);
			    ResultSet rs7 = statement.executeQuery("select NUM(ifGuestTeamWin) from t_match where guestTeam='"+teamName+"'");
			    while(rs7.next())
			    	winningNum += rs7.getInt(0);
			    //opponentDefensiveRebound
			    ResultSet rs8 = statement.executeQuery("select NUM(guestDefensiveRebound) from t_match where homeTeam='"+teamName+"'");
			    while(rs8.next())
			    	opponentDefensiveRebound = rs8.getInt(0);
			    ResultSet rs9 = statement.executeQuery("select NUM(homeDefensiveRebound) from t_match where guestTeam='"+teamName+"'");
			    while(rs9.next())
			    	opponentDefensiveRebound += rs9.getInt(0);
			    //opponentOffensiveRebound
			    ResultSet rs10 = statement.executeQuery("select NUM(guestOffensiveRebound) from t_match where homeTeam='"+teamName+"'");
			    while(rs10.next())
			    	opponentOffensiveRebound = rs10.getInt(0);
			    ResultSet rs11 = statement.executeQuery("select NUM(homeOffensiveRebound) from t_match where guestTeam='"+teamName+"'");
			    while(rs11.next())
			    	opponentOffensiveRebound += rs11.getInt(0);
			    //opponentOffensiveRound
			    ResultSet rs12 = statement.executeQuery("select NUM(guestOffensiveRound) from t_match where homeTeam='"+teamName+"'");
			    while(rs12.next())
			    	opponentOffensiveRound = rs12.getInt(0);
			    ResultSet rs13 = statement.executeQuery("select NUM(homeOffensiveRound) from t_match where guestTeam='"+teamName+"'");
			    while(rs13.next())
			    	opponentOffensiveRound += rs13.getInt(0);
			    //opponentScore
			    ResultSet rs14 = statement.executeQuery("select NUM(guestScore) from t_match where homeTeam='"+teamName+"'");
			    while(rs14.next())
			    	opponentScore = rs14.getInt(0);
			    ResultSet rs15 = statement.executeQuery("select NUM(homeScore) from t_match where guestTeam='"+teamName+"'");
			    while(rs15.next())
			    	opponentScore += rs15.getInt(0);
			    
			    sql+="("+teamName+","+season+","+gameNum+","+shotInNum+","+shotNum+","+threeShotInNum+","+threeShotNum+","+penaltyShotInNum+","+
			    penaltyShotNum+","+offensiveRebound+","+defensiveRebound+","+rebound+","+secondaryAttack+","+steal+","+blockShot+","+fault+","+
			    		foul+","+score+","+null+","+null+","+null+","+null+","+winningNum+","+offensiveRound+","
			    +null+","+null+","+null+","+null+","+null+","+opponentDefensiveRebound+","+
			    		opponentOffensiveRebound+","+opponentOffensiveRound+","+opponentScore+") ";
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

	//Éú³ÉPlayerTechPO
	public void playerTech(){
		String name = "";                            //ÇòÔ±Ãû³Æ
		String season = "";                          //Èü¼¾
		String team = "";                            //ËùÊôÇò¶Ó
		int gameNum = 0;                         //²ÎÈü³¡Êı
		int startingNum = 0;                     //ÏÈ·¢³¡Êı
		int rebound = 0;                         //Àº°åÊı
		int secondaryAttack = 0;                 //Öú¹¥Êı
		int time = 0;                            //ÔÚ³¡Ê±¼ä
	/*	double shotInRate = 0;                      //Í¶ÀºÃüÖĞÂÊ
		double threeShotInRate = 0;                 //Èı·ÖÃüÖĞÂÊ
		double penaltyShotInRate = 0;               //·£ÇòÃüÖĞÂÊ
	*/
		int offensiveNum = 0;                    //½ø¹¥Êı
		int defensiveNum = 0;                    //·ÀÊØÊı
		int steal = 0;                           //ÇÀ¶ÏÊı
		int blockShot = 0;                       //¸ÇÃ±Êı
		int fault = 0;                           //Ê§ÎóÊı
		int foul = 0;                            //·¸¹æÊı
		int score = 0;                           //µÃ·Ö
	/*	double efficiency = 0;                        //Ğ§ÂÊ
		double GmScEfficiency = 0;                    //GmScĞ§ÂÊÖµ
		double trueShotInRate = 0;                  //ÕæÊµÃüÖĞÂÊ
		double shootingEfficiency = 0;                //Í¶ÀºĞ§ÂÊ
		double reboundRate = 0;                     //Àº°åÂÊ
		double offensiveReboundRate = 0;            //½ø¹¥Àº°åÂÊ
		double defensiveReboundRate = 0;            //·ÀÊØÀº°åÂÊ
		double secondaryAttackRate = 0;             //Öú¹¥ÂÊ
		double stealRate = 0;                       //ÇÀ¶ÏÂÊ
		double blockShotRate = 0;                   //¸ÇÃ±ÂÊ
		double faultRate = 0;                       //Ê§ÎóÂÊ	
		double usageRate = 0;                       //Ê¹ÓÃÂÊ
		*/
		int shotIn = 0;                       //Í¶ÀºÃüÖĞÊı
		int shot = 0;                         //Í¶Àº³öÊÖÊı
		int threeShotIn = 0;                  //Èı·ÖÃüÖĞÊı
		int threeShot = 0;                    //Èı·Ö³öÊÖÊı
		int penaltyShotIn = 0;                //·£ÇòÃüÖĞÊı
		int penaltyShot = 0;                  //·£Çò³öÊÖÊı
		int teamAllTime = 0;                  //È«¶ÓÉÏ³¡Ê±¼ä
		int teamOffensiveRebound = 0;                  //È«¶Ó½ø¹¥Àº°å
		int teamDefensiveRebound = 0;                //È«¶Ó·ÀÊØÀº°å
		int opponentOffensiveRebound = 0;                  //¶ÔÊÖ½ø¹¥Àº°å
		int opponentDefensiveRebound = 0;                //¶ÔÊÖ·ÀÊØÀº°å
		int teamShotIn = 0;                             //È«¶Ó½øÇòÊı
		int opponentOffensiveNum = 0;                     //¶ÔÊÖ½ø¹¥´ÎÊı
		int opponentTwoShot = 0;                     //¶ÔÊÖÁ½·ÖÇò³öÊÖ´ÎÊı
		int teamShot = 0;                          //È«¶Ó³öÊÖ´ÎÊı
		int teamPenaltyShot = 0;                   //È«¶Ó·£Çò´ÎÊı
		int teamFault = 0;                          //È«¶ÓÊ§Îó´ÎÊı  
		
		//Á¬½ÓÖÁÊı¾İ¿â
		//Çı¶¯³ÌĞòÃû
		String driver = "com.mysql.jdbc.Driver";
		//URLÖ¸ÏòÒª·ÃÎÊµÄÊı¾İ¿âÃûnba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
	    // MySQLÅäÖÃÊ±µÄÓÃ»§Ãû
		String user = "root";
		// JavaÁ¬½ÓMySQLÅäÖÃÊ±µÄÃÜÂë
		String password = "";
		try {
			// ¼ÓÔØÇı¶¯³ÌĞò
			Class.forName(driver);
			// Á¬ĞøÊı¾İ¿â
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statementÓÃÀ´Ö´ĞĞSQLÓï¾ä
			Statement statement = conn.createStatement();
		
			String sql = "insert into t_playerdata values ";
			ResultSet rs1 = statement.executeQuery("select name, season, team, NUM(ifParticipate),NUM(ifFirstLineUp),NUM(rebound),"
					+ "NUM(secondaryAttack),NUM(time),NUM(offensiveRebound),NUM(defensiveRebound),NUM(steal),NUM(blockShot),NUM(fault),NUM(foul),"
					+ "NUM(score),NUM(shotIn),NUM(shot),NUM(threeShotIn),NUM(threeShot),NUM(penaltyShotIn),NUM(penaltyShot) GROUP BY(name)");
			while(rs1.next()){
				name = rs1.getString(0);
				season = rs1.getString(1);
				team = rs1.getString(2);
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
			sql+="("+name+","+season+","+team+","+gameNum+","+startingNum+","+rebound+","+secondaryAttack+","+time+","+null+","+null+","+null+","+offensiveNum+","+defensiveNum+","+steal+","+blockShot+","+fault+","+foul+","+score+","+
				null+","+null+","+null+","+null+","+null+","+null+","+null+","+null+","+null+","+null+","+null+","+null+","+shotIn+","+shot+","+threeShotIn+","+threeShot+","+penaltyShotIn+","+penaltyShot+","+teamAllTime+","+teamOffensiveRebound
				+","+teamDefensiveRebound+","+opponentOffensiveRebound+","+opponentDefensiveRebound+","+teamShotIn+","+opponentOffensiveNum+","+opponentTwoShot+","+teamShot+","+teamPenaltyShot+","+teamFault+")";
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
>>>>>>> parent of 4c8e36c... æ•°æ®åº“ä¼˜åŒ–:src/data/sqlInitial.java
}

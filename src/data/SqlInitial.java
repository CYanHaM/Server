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
* 供初始化数据库时调用
*/
public class SqlInitial {
	public static void main(String[] args){
		SqlInitial si = new SqlInitial();
		//player已成功导入
		si.team();
		// si.match();
		// si.teamTech();
		// si.playerTech();
    }

	DataToSQL dts = new DataProcessing();

	public void player(){

		ArrayList<PlayerPO> list = dts.playerRead();
		int size = list.size();

		//连接至数据库//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
				}
			// statement用来执行SQL语句
			Statement statement = conn.createStatement();
			PlayerPO po0 = list.get(0);
			String sql = "insert into t_player values ('"+po0.name.replaceAll("'", "''")+"','"+po0.uniformNum+"','"+po0.position+"','"+po0.height+"','"+po0.weight+"','"+po0.birth+"','"+po0.age+"','"+po0.exp+"','"+po0.school.replaceAll("'", "''")+"')";
			for(int i=1;i<size;i++){
				PlayerPO po = list.get(i);
				//测试用
			//	System.out.println(sql);
				sql += ",('"+po.name.replaceAll("'", "''")+"','"+po.uniformNum+"','"+po.position+"','"+po.height+"','"+po.weight+"','"+po.birth+"','"+po.age+"','"+po.exp+"','"+po.school.replaceAll("'", "''")+"') ";
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
		//连接至数据库
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement用来执行SQL语句
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
	
	//matchPO生成t_match和t_detail
	public void match(){
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement用来执行SQL语句
			Statement statement = conn.createStatement();
			ArrayList<MatchPO> list = dts.matchRead();
			int size = list.size();
			String sql2 = "insert into t_match values ";
			for(int i=0;i<size;i++){
				MatchPO temp = list.get(i);
			//生成t_match
			sql2+="('"+temp.season+"','"+temp.date+"','"+temp.homeTeam+"','"+temp.guestTeam+"','"+temp.score+"','"+temp.score1+"','"+temp.score2+"','"+temp.score3
			+"','"+temp.score4+"','"+temp.scoreExtra+"','"+temp.ifHomeTeamWin+"','"+temp.ifGuestTeamWin+"','"+temp.homeTeamDeffensiveRebound+"','"+temp.guestTeamDeffensiveRebound+"','"+
			temp.homeTeamOffensiveRebound+"','"+temp.guestTeamOffensiveRebound+"','"+temp.homeTeamOffensiveRound+"','"+temp.guestTeamOffensiveRound+"','"+temp.homeScore+"','"+temp.guestScore
			+"','"+temp.homeAllTime+"','"+temp.guestAllTime+"','"+temp.homeShotIn+"','"+temp.guestShotIn+"','"+temp.homeTwoShot+"','"+temp.guestTwoShot+"','"+temp.homeShot+"','"+temp.guestShot+"','"+
			temp.homePenaltyShot+"','"+temp.guestPenaltyShot+"','"+temp.homeFoul+"','"+temp.guestFoul+"') ";
			//生成t_detail
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
	
	//生成TeamTechPO,有两个重复使用的查询语句，待优化。
	public void teamTech(){

		String teamName = ""; //球队名称
		String season = ""; //赛季
		int gameNum = 0; //比赛场数
		int shotInNum = 0; //投篮命中数
		int shotNum = 0; //投篮出手数
		int threeShotInNum = 0; //三分命中数
		int threeShotNum = 0; //三分出手数
		int twoShotInNum = 0;
		int twoShotNum = 0;
		int penaltyShotInNum = 0; //罚球命中数
		int penaltyShotNum = 0; //罚球出手数
		int offensiveRebound = 0; //前场篮板数
		int defensiveRebound = 0; //后场篮板数
		int rebound = 0; //总篮板数
		int fault = 0; //失误数
		int secondaryAttack = 0; //助攻数
		int steal = 0; //抢断数
		int blockShot = 0; //盖帽数
		int foul = 0; //犯规数
		int score = 0; //比赛得分
		double shotInRate = 0; //投篮命中率
		double threeShotInRate = 0; //三分命中率
		double penaltyShotInRate = 0; //罚球命中率
		double winningRate = 0; //胜率
		int winningNum = 0; //胜场数
		double offensiveRound = 0; //进攻回合
		double offensiveEfficiency = 0; //进攻效率
		double defensiveEfficiency = 0; //防守效率
		double reboundEfficiency = 0; //篮板效率
		double stealEfficiency = 0; //抢断效率
		double secondaryAttackEfficiency = 0; //助攻效率
		int opponentDefensiveRebound = 0; //对方防守篮板
		int opponentOffensiveRebound = 0; //对方进攻篮板
		double opponentOffensiveRound = 0; //对方进攻回合
		int opponentScore = 0; //对方得分
		//连接至数据库
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "";
		try {
			// 加载驱动程序
		Class.forName(driver);
		// 连续数据库
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed()){
			System.out.println("Succeeded connecting to the Database!");
		}
		// statement用来执行SQL语句
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

	//生成PlayerTechPO
	public void playerTech(){
		String name = ""; //球员名称
		String season = ""; //赛季
		String team = ""; //所属球队
		int gameNum = 0; //参赛场数
		int startingNum = 0; //先发场数
		int rebound = 0; //篮板数
		int secondaryAttack = 0; //助攻数
		int time = 0; //在场时间
		double shotInRate = 0; //投篮命中率
		double threeShotInRate = 0; //三分命中率
		double penaltyShotInRate = 0; //罚球命中率
		int offensiveNum = 0; //进攻数
		int defensiveNum = 0; //防守数
		int steal = 0; //抢断数
		int blockShot = 0; //盖帽数
		int fault = 0; //失误数
		int foul = 0; //犯规数
		int score = 0; //得分
		double efficiency = 0; //效率
		double GmScEfficiency = 0; //GmSc效率值
		double trueShotInRate = 0; //真实命中率
		double shootingEfficiency = 0; //投篮效率
		double reboundRate = 0; //篮板率
		double offensiveReboundRate = 0; //进攻篮板率
		double defensiveReboundRate = 0; //防守篮板率
		double secondaryAttackRate = 0; //助攻率
		double stealRate = 0; //抢断率
		double blockShotRate = 0; //盖帽率
		double faultRate = 0; //失误率
		double usageRate = 0; //使用率
		int shotIn = 0; //投篮命中数
		int shot = 0; //投篮出手数
		int threeShotIn = 0; //三分命中数
		int threeShot = 0; //三分出手数
		int penaltyShotIn = 0; //罚球命中数
		int penaltyShot = 0; //罚球出手数
		int teamAllTime = 0; //全队上场时间
		int teamOffensiveRebound = 0; //全队进攻篮板
		int teamDefensiveRebound = 0; //全队防守篮板
		int opponentOffensiveRebound = 0; //对手进攻篮板
		int opponentDefensiveRebound = 0; //对手防守篮板
		int teamShotIn = 0; //全队进球数
		int opponentOffensiveNum = 0; //对手进攻次数
		int opponentTwoShot = 0; //对手两分球出手次数
		int teamShot = 0; //全队出手次数
		int teamPenaltyShot = 0; //全队罚球次数
		int teamFault = 0; //全队失误次数
		//连接至数据库
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名nba
		String url = "jdbc:mysql://127.0.0.1:3306/nba";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
			}
			// statement用来执行SQL语句
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
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

public class dealWithSql implements SQLservice {

	public ArrayList<PlayerTechPO> getPlayerTech() {
		// TODO Auto-generated method stub
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			// 要执行的SQL语句
			String sql = "SELECT * FROM t_playerdata";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){ 
				PlayerTechPO po = new PlayerTechPO();
				po.index = rs.getInt(1);
				po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(5);
				po.startingNum = rs.getInt(6);
				po.rebound = rs.getInt(7);
				po.secondaryAttackRate = rs.getInt(8);
				po.time = rs.getInt(9);
				po.shotInRate = rs.getDouble(10);
				po.threeShotInRate = rs.getDouble(11);
				po.penaltyShotInRate = rs.getDouble(12);
				po.offensiveNum = rs.getInt(13);
				po.defensiveNum = rs.getInt(14);
				po.steal = rs.getInt(15);
				po.blockShot = rs.getInt(16);
				po.fault = rs.getInt(17);
				po.foul = rs.getInt(18);
				po.score = rs.getInt(19);
				po.efficiency = rs.getDouble(20);
				po.GmScEfficiency = rs.getDouble(21);
				po.trueShotInRate = rs.getDouble(22);
				po.shootingEfficiency = rs.getDouble(23);
				po.reboundRate = rs.getDouble(24);
				po.offensiveReboundRate = rs.getDouble(25);
				po.defensiveReboundRate = rs.getDouble(26);
				po.secondaryAttackRate = rs.getDouble(27);
				po.stealRate = rs.getDouble(28);
				po.blockShotRate = rs.getDouble(29);
				po.faultRate = rs.getDouble(30);
				po.usageRate = rs.getDouble(31);
				po.shotIn = rs.getInt(32);
				po.shot = rs.getInt(33);
				po.threeShotIn = rs.getInt(34);
				po.threeShot = rs.getInt(35);
				po.penaltyShotIn = rs.getInt(36);
				po.penaltyShot = rs.getInt(37);
				po.teamAllTime = rs.getInt(38);
				po.teamOffensiveRebound = rs.getInt(39);
				po.teamDefensiveRebound = rs.getInt(40);
				po.opponentOffensiveRebound = rs.getInt(41);
				po.opponentDefensiveRebound = rs.getInt(42);
				po.teamShotIn = rs.getInt(43);
				po.opponentOffensiveNum = rs.getInt(44);
				po.opponentTwoShot = rs.getInt(45);
				po.teamShot = rs.getInt(46);
				po.teamPenaltyShot = rs.getInt(47);
				po.teamFault = rs.getInt(48);
				list.add(po);
			}
			rs.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
}
	@Override
	public ArrayList<TeamTechPO> getTeamTech() {
		// TODO Auto-generated method stub
		ArrayList<TeamTechPO> list = new ArrayList<TeamTechPO>();
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
			// 要执行的SQL语句
			String sql = "SELECT * FROM t_seasondata";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				TeamTechPO po = new TeamTechPO();
				po.index = rs.getInt(1);
				po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(4);
				po.shotInNum = rs.getInt(5);
				po.shotNum = rs.getInt(6);
				po.threeShotInNum = rs.getInt(7);
				po.threeShotNum = rs.getInt(8);
				po.penaltyShotInNum = rs.getInt(9);
				po.penaltyShotNum = rs.getInt(10);
				po.offensiveRebound = rs.getInt(11);
				po.defensiveRebound = rs.getInt(12);
				po.rebound = rs.getInt(13);
				po.secondaryAttack = rs.getInt(14);
				po.steal = rs.getInt(15);
				po.blockShot = rs.getInt(16);
				po.fault = rs.getInt(17);
				po.foul = rs.getInt(18);
				po.score = rs.getInt(19);
				po.shotInRate = rs.getDouble(20);
				po.threeShotInRate = rs.getDouble(21);
				po.penaltyShotInRate = rs.getDouble(22);
				po.winningRate = rs.getDouble(23);
				po.winningNum = rs.getInt(24);
				po.offensiveRound = rs.getDouble(25);
				po.offensiveEfficiency = rs.getDouble(26);
				po.defensiveEfficiency = rs.getDouble(27);
				po.reboundEfficiency = rs.getDouble(28);
				po.stealEfficiency = rs.getDouble(29);
				po.secondaryAttackEfficiency = rs.getDouble(30);
				po.opponentDefensiveRebound = rs.getInt(31);
				po.opponentOffensiveRebound = rs.getInt(32);
				po.opponentOffensiveRound = rs.getInt(33);
				po.opponentScore = rs.getInt(34);
				list.add(po);
			}
			rs.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
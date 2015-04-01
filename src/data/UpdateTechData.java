package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

public class UpdateTechData implements UpdateService {
	
	public void updatePlayerTech(ArrayList<PlayerTechPO> list){
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
			Statement statement = conn.createStatement();
			String sql = "replace into t_playerdata values";   
			int size = list.size(); 
			for(int i=0;i<size;i++){
				PlayerTechPO po = list.get(i); 
				if(i!=0) sql+=",";
				sql += "('"+po.index+"','"+po.name.replaceAll("'", "''")+"','"+po.season+"','"+po.team+"','"+po.gameNum+"','"+po.startingNum+"','"+po.rebound+"','"+po.secondaryAttack+"','"+po.time+"','"+po.shotInRate+"','"+po.threeShotInRate+"','"+po.penaltyShotInRate+"','"+po.offensiveNum+"','"+po.defensiveNum+"','"+po.steal+"','"+po.blockShot+"','"+po.fault+"','"+po.foul+"','"+po.score+"','"+
						po.efficiency+"','"+po.GmScEfficiency+"','"+po.trueShotInRate+"','"+po.shootingEfficiency+"','"+po.reboundRate+"','"+po.offensiveReboundRate+"','"+po.defensiveReboundRate+"','"+po.secondaryAttackRate+"','"+po.stealRate+"','"+po.blockShotRate+"','"+po.faultRate+"','"+po.usageRate+"','"+po.shotIn+"','"+po.shot+"','"+po.threeShotIn+"','"+po.threeShot+"','"+po.penaltyShotIn+"','"+po.penaltyShot+"','"+po.teamAllTime+"','"+po.teamOffensiveRebound
						+"','"+po.teamDefensiveRebound+"','"+po.opponentOffensiveRebound+"','"+po.opponentDefensiveRebound+"','"+po.teamShotIn+"','"+po.opponentOffensiveNum+"','"+po.opponentTwoShot+"','"+po.teamShot+"','"+po.teamPenaltyShot+"','"+po.teamFault+"') ";
			
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
	
	public void updateTeamTech(ArrayList<TeamTechPO> list){
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
			Statement statement = conn.createStatement();
			String sql = "replace into t_seasondata values";
			int size = list.size();
			for(int i=0;i<size;i++){
				TeamTechPO po = list.get(i);
				if(i!=0) sql+=",";
				sql += "('"+po.index+"','"+po.name+"','"+po.season+"','"+po.gameNum+"','"+po.shotInNum+"','"+po.shotNum+"','"+po.threeShotInNum+"','"+po.threeShotNum+"','"+po.penaltyShotInNum+"','"+
						po.penaltyShotNum+"','"+po.offensiveRebound+"','"+po.defensiveRebound+"','"+po.rebound+"','"+po.secondaryAttack+"','"+po.steal+"','"+po.blockShot+"','"+po.fault+"','"+
						po.foul+"','"+po.score+"','"+po.shotInRate+"','"+po.threeShotInRate+"','"+po.penaltyShotInRate+"','"+po.winningRate+"','"+po.winningNum+"','"+po.offensiveRound+"','"
						+po.offensiveEfficiency+"','"+po.defensiveEfficiency+"','"+po.reboundEfficiency+"','"+po.stealEfficiency+"','"+po.secondaryAttackEfficiency+"','"+po.opponentDefensiveRebound+"','"+
						po.opponentOffensiveRebound+"','"+po.opponentOffensiveRound+"','"+po.opponentScore+"') ";
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

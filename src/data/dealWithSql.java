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

	@Override
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
<<<<<<< HEAD
			// 要执行的SQL语句
=======
			// Ҫִ�е�SQL���
>>>>>>> parent of 4c8e36c... 数据库优化
			String sql = "SELECT FROM t_playerdata";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.name = rs.getString(1);
				po.team = rs.getString(2);
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getInt(7);
				po.shotInRate = rs.getDouble(8);
				po.threeShotInRate = rs.getDouble(9);
				po.penaltyShotInRate = rs.getDouble(10);
				po.offensiveNum = rs.getInt(11);
				po.defensiveNum = rs.getInt(12);
				po.steal = rs.getInt(13);
				po.blockShot = rs.getInt(14);
				po.fault = rs.getInt(15);
				po.foul = rs.getInt(16);
				po.score = rs.getInt(17);
				po.efficiency = rs.getDouble(18);
				po.GmScEfficiency = rs.getDouble(19);
				po.trueShotInRate = rs.getDouble(20);
				po.shootingEfficiency = rs.getDouble(21);
				po.reboundRate = rs.getDouble(22);
				po.offensiveReboundRate = rs.getDouble(23);
				po.defensiveReboundRate = rs.getDouble(24);
				po.secondaryAttackRate = rs.getDouble(25);
				po.stealRate = rs.getDouble(26);
				po.blockShotRate = rs.getDouble(27);
				po.faultRate = rs.getDouble(28);
				po.usageRate = rs.getDouble(29);
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
<<<<<<< HEAD
			// 要执行的SQL语句
=======
			// Ҫִ�е�SQL���
>>>>>>> parent of 4c8e36c... 数据库优化
			String sql = "SELECT FROM t_playerdata";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				TeamTechPO po = new TeamTechPO();
				po.name = rs.getString(0);
				po.season = rs.getString(1);
				po.gameNum = rs.getInt(2);
				po.shotInNum = rs.getInt(3);
				po.shotNum =  rs.getInt(4);
				po.threeShotInNum = rs.getInt(5);
				po.threeShotNum =  rs.getInt(6);
				po.penaltyShotInNum =  rs.getInt(7);
				po.penaltyShotNum =  rs.getInt(8);
				po.offensiveRebound =  rs.getInt(9);
				po.defensiveRebound =  rs.getInt(10);
				po.rebound =  rs.getInt(11);
				po.secondaryAttack = rs.getInt(12);
				po.steal =  rs.getInt(13);
				po.blockShot =  rs.getInt(14);
				po.fault =  rs.getInt(15);
				po.foul =  rs.getInt(16);
				po.score =  rs.getInt(17);
				po.shotInRate = rs.getDouble(18);
				po.threeShotInRate = rs.getDouble(19);
				po.penaltyShotInRate = rs.getDouble(20);
				po.winningRate = rs.getDouble(21);
				po.offensiveEfficiency = rs.getDouble(22);
				po.defensiveEfficiency = rs.getDouble(23);
				po.reboundEfficiency = rs.getDouble(24);
				po.stealEfficiency = rs.getDouble(25);
				po.secondaryAttackEfficiency = rs.getDouble(26);
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

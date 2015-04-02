package data;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.TeamTechPO;
import dataservice.TeamTechDataService;

public class TeamTechData extends UnicastRemoteObject implements TeamTechDataService,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamTechData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<TeamTechPO> ascend(String type) {
		// TODO Auto-generated method stub
		ArrayList<TeamTechPO> list = new ArrayList<TeamTechPO>();
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
			String sql = "select * from t_seasondata order by ?";
			Statement st = conn.createStatement();
			sql = sql.replace("?", type);
			ResultSet rs = st.executeQuery(sql);
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
			System.out.println("acsend teamTech");
			rs.close();
			conn.close();
		}catch(ClassNotFoundException e) {
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
	public ArrayList<TeamTechPO> descend(String type) {
		// TODO Auto-generated method stub
		ArrayList<TeamTechPO> list = new ArrayList<TeamTechPO>();
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
			String sql = "select * from t_seasondata order by ? DESC";
			Statement st = conn.createStatement();
			sql = sql.replace("?", type);
			ResultSet rs = st.executeQuery(sql);
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
			System.out.println("desc teamTech");
			System.out.println(list.get(0).name);
			rs.close();
			conn.close();
		}catch(ClassNotFoundException e) {
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
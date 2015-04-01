package data;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import PO.TeamPO;
import dataservice.TeamDataService;


public class TeamData extends UnicastRemoteObject implements TeamDataService,Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TeamData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

/*	
	public static void main(String[] args){
		TeamData td = new TeamData();
		TeamPO tpo = new TeamPO();
		tpo.abbreviation = "CHA";
		TeamPO res = td.find(tpo);
		System.out.println(res.fullName);
	}
*/
	
	@Override
	public TeamPO find(TeamPO tpo) {
		// TODO Auto-generated method stub
		String name = tpo.abbreviation;
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
			String sql = "SELECT * FROM t_team WHERE abbreviation = '"+name+"'";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				tpo.fullName = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				tpo.location = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				tpo.division = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				tpo.partition = new String(rs.getString(5).getBytes("ISO-8859-1"),"utf-8");
				tpo.homeCourt = new String(rs.getString(6).getBytes("ISO-8859-1"),"utf-8");
				tpo.time = new String(rs.getString(7).getBytes("ISO-8859-1"),"utf-8");
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
		return tpo;
	}
}
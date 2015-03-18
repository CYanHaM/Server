package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import PO.TeamPO;
import dataservice.TeamDataService;

public class TeamData implements TeamDataService{

	@Override
	public TeamPO find(TeamPO tpo) {
		// TODO Auto-generated method stub
        String name = tpo.abbreviation;
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
			// Ҫִ�е�SQL���
			String sql = "SELECT 1 FROM t_team WHERE acronym = '"+name+"'";
			ResultSet rs = statement.executeQuery(sql);  
			while(rs.next()) {
				tpo.fullName = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				tpo.location = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				tpo.division = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				tpo.partition = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				tpo.homeCourt = new String(rs.getString(5).getBytes("ISO-8859-1"),"utf-8");
				tpo.time = new String(rs.getString(6).getBytes("ISO-8859-1"),"utf-8");
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

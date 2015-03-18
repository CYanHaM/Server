package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;
import dataservice.PlayerTechDataService;

public class PlayerTechData implements PlayerTechDataService {
	//ѡ��ĳ����������,������������Ա�����б�
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum list){
		return null;
	}
	

	//ѡ��ĳ����������,���ؽ�������Ա�����б�
	public ArrayList<PlayerTechPO>descend(PlayerTechEnum list){
		return null;
	}

	@Override
	public ArrayList<PlayerTechPO> sift(PlayerTechPO ptpo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//���������ݿ�
	public ArrayList<PlayerTechPO> link(String field){
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
			String sql = "select * from t_team";
			ResultSet rs = statement.executeQuery(sql);  
			System.out.println("-----------------");  
			System.out.println("ִ�н��������ʾ:");  
			System.out.println("-----------------"); 
			String name = null;  
			while(rs.next()) {  
				//ѡ��name��������
				name = rs.getString("name");
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ���ַ�������ָ�����ֽ�����
				name = new String(name.getBytes("ISO-8859-1"),"utf-8");

				// ���
				System.out.println(rs.getString("division") + "\t" + name);  
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
	return null;
	}


	

}

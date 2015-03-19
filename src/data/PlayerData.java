package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerPO;
import PO.TeamPO;
import dataservice.PlayerDataService;

public class PlayerData implements PlayerDataService{
	@Override
	/* �������Բ�����Ա�����������洢��ppo��
	 * �ɲ��ҵ�����������
	 * */
	public PlayerPO find(PlayerPO ppo) {
		// TODO Auto-generated method stub
		String name = ppo.name;
		
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
			String sql = "SELECT 1 FROM t_player WHERE first_name = '"+name+"'";
			ResultSet rs = statement.executeQuery(sql);  
			while(rs.next()) {  
				ppo.uniformNum = rs.getInt(3);//������ no
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ���ַ�������ָ�����ֽ�����
				ppo.position = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				ppo.height = new String(rs.getString(5).getBytes("ISO-8859-1"),"utf-8");
				ppo.weight = rs.getDouble(6);
				ppo.birth = new String(rs.getString(7).getBytes("ISO-8859-1"),"utf-8");
				//System.out.println(temp);
				ppo.age = rs.getInt(8);
				ppo.exp = rs.getInt(9);
				ppo.school = new String(rs.getString(10).getBytes("ISO-8859-1"),"utf-8");
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
		return ppo;
	}

	@Override
	public ArrayList<PlayerPO> findByTeam(TeamPO tpo) {
		// TODO Auto-generated method stub
		String abb = tpo.abbreviation;
		ArrayList<PlayerPO> list = new ArrayList<PlayerPO>();
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
			String sql = "SELECT * FROM t_player WHERE team = '"+abb+"'";
			ResultSet rs = statement.executeQuery(sql);  
			while(rs.next()) {  
				PlayerPO po = new PlayerPO();
				String first = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				String last = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.name = first + " " + last;
				po.uniformNum = rs.getInt(3);//������ no
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ���ַ�������ָ�����ֽ�����
				po.position = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.height = new String(rs.getString(5).getBytes("ISO-8859-1"),"utf-8");
				po.weight = rs.getDouble(6);
				po.birth = new String(rs.getString(7).getBytes("ISO-8859-1"),"utf-8");
				//System.out.println(temp);
				po.age = rs.getInt(8);
				po.exp = rs.getInt(9);
				po.school = new String(rs.getString(10).getBytes("ISO-8859-1"),"utf-8");
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

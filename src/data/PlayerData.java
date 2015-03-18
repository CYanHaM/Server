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
	/* 按照属性查找球员，查找条件存储在ppo中
	 * 可查找的属性有姓名
	 * */
	public PlayerPO find(PlayerPO ppo) {
		// TODO Auto-generated method stub
		String[] name = ppo.name.split("\\s+");
		
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
			String sql = "SELECT 1 FROM t_player WHERE first_name = '"+name[0]+"'"
					+ "AND last_name = '"+name[1]+"'";
			ResultSet rs = statement.executeQuery(sql);  
			while(rs.next()) {  
				ppo.uniformNum = rs.getInt(3);//第三列 no
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用字符集解码指定的字节数组
				ppo.position = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				ppo.height = new String(rs.getString(5).getBytes("ISO-8859-1"),"utf-8");
				ppo.weight = rs.getDouble(6);
				ppo.birth = new String(rs.getString(7).getBytes("ISO-8859-1"),"utf-8");
				//System.out.println(temp);
				ppo.age = rs.getInt(8);
				ppo.exp = rs.getDouble(9);
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
		return null;
	}
	
	

}

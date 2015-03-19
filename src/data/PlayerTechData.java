package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;
import dataservice.PlayerTechDataService;

public class PlayerTechData implements PlayerTechDataService {
	//选择某个条件升序,返回升序后的球员数据列表
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum list){
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_team order by ?");
			switch(list) {
				case name:
					cmd.setString(1, "name");
					break;
				case team:
					cmd.setString(1, "team");
					break;
				case gameNum:
					cmd.setString(1, "gameNum");
					break;
				case startingNum:
					cmd.setString(1, "startingNum");
					break;
				case rebound:
					cmd.setString(1, "rebound");
					break;
				case secondaryAttack:
					cmd.setString(1, "secondaryAttack");
					break;
				case time:
					cmd.setString(1, "time");
					break;
				case shotInRate:
					cmd.setString(1, "shotInRate");
					break;
				case threeshotInRate:
					cmd.setString(1, "threeshotInRate");
					break;
				case penaltyShotInRate:
					cmd.setString(1, "penaltyShotInRate");
					break;
				case offensiveNum:
					cmd.setString(1, "offensiveNum");
					break;
				case defensiveNum:
					cmd.setString(1, "defensiveNum");
					break;
				case steal:
					cmd.setString(1, "steal");
					break;
				case blockShot:
					cmd.setString(1, "blockShot");
					break;
				case fault:
					cmd.setString(1, "fault");
					break;
				case foul:
					cmd.setString(1, "foul");
					break;
				case score:
					cmd.setString(1, "score");
					break;
				case efficiency:
					cmd.setString(1, "efficiency");
					break;
				case GmScEfficiency:
					cmd.setString(1, "GmScEfficiency");
					break;
				case trueShotInRate:
					cmd.setString(1, "trueShotInRate");
					break;
				case shootingEfficiency:
					cmd.setString(1, "shootingEfficiency");
					break;
				case reboundRate:
					cmd.setString(1, "reboundRate");
					break;
				default:
					System.out.println("wrong enum value");
			}
					
			}
			
		return null;
	}
	

	//选择某个条件降序,返回降序后的球员数据列表
	public ArrayList<PlayerTechPO>descend(PlayerTechEnum list){
		return null;
	}

	@Override
	public ArrayList<PlayerTechPO> sift(PlayerTechPO ptpo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//连接至数据库
	public ArrayList<PlayerTechPO> link(String field){
				
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
			String sql = "select * from t_team";
			ResultSet rs = statement.executeQuery(sql);  
			System.out.println("-----------------");  
			System.out.println("执行结果如下所示:");  
			System.out.println("-----------------"); 
			String name = null;  
			while(rs.next()) {  
				//选择name这列数据
				name = rs.getString("name");
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用字符集解码指定的字节数组
				name = new String(name.getBytes("ISO-8859-1"),"utf-8");

				// 输出
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

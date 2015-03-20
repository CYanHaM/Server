package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerPO;
import PO.TeamPO;
/*
 * 供初始化数据库时调用
 */
public class sqlInitial {
	DataToSQL dts = new DataProcessing();
	public void player(){
		ArrayList<PlayerPO> list = dts.playerRead();
		int size = list.size();
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
			
			for(int i=0;i<size;i++){
				PlayerPO po = list.get(i);
				String sql = "insert t_player (name,uniformNum,position,height,weight,birth,age,exp,school) values ('"+po.name+"','"+po.uniformNum+"','"+po.position+"','"+po.height+"','"+po.weight+"','"+po.birth+"','"+po.age+"','"+po.age+"','"+po.exp+"','"+po.school+"')";
				statement.executeQuery(sql);
			}
			conn.close();
		} catch(ClassNotFoundException e) {   
	        System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
        } catch(SQLException e) {   
	        e.printStackTrace();   
	    } catch(Exception e) {   
	        e.printStackTrace();   
     	}   
	}
	
	public void team(){
		ArrayList<TeamPO> list = dts.teamRead();
		int size = list.size();
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
			
			for(int i=0;i<size;i++){
				TeamPO po = list.get(i);
				String sql = "insert t_team (fullName,abbreviation,location,division,partition,homeCourt,time) values ('"+po.fullName+"','"+po.abbreviation+"','"+po.location+"','"+po.division+"','"+po.partition+"','"+po.homeCourt+"','"+po.time+"')";
				statement.executeQuery(sql);
			}
			conn.close();
		} catch(ClassNotFoundException e) {   
	        System.out.println("Sorry,can`t find the Driver!");   
	        e.printStackTrace();   
        } catch(SQLException e) {   
	        e.printStackTrace();   
	    } catch(Exception e) {   
	        e.printStackTrace();   
     	}   
	}
	
	public void match(){
	
	}

}

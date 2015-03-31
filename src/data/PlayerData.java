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
	
	public static void main(String[] args){
		PlayerData pd = new PlayerData();
	/*	PlayerPO ppo = new PlayerPO();
		ppo.name = "Aaron Brooks";
		PlayerPO res1 = pd.find(ppo);
		System.out.println(res1.age+" "+res1.school);
	*/
		TeamPO tpo = new TeamPO();
		tpo.abbreviation = "CHA";
		ArrayList<PlayerPO> res2 = pd.findByTeam(tpo);
		for(int i=0;i<res2.size();i++){
			System.out.println(res2.get(i).name);
		}
	}
	
	@Override
	/* 按照属性查找球员，查找条件存储在ppo中
	* 可查找的属性有姓名
	* */
	public PlayerPO find(PlayerPO ppo) {
		// TODO Auto-generated method stub
		String name = ppo.name;
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
			String sql = "SELECT * FROM t_player WHERE name = '"+name+"' limit 1";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ppo.uniformNum = rs.getInt(2);
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用字符集解码指定的字节数组
				ppo.position = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				ppo.height = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				ppo.weight = rs.getDouble(5);
				ppo.birth = new String(rs.getString(6).getBytes("ISO-8859-1"),"utf-8");
				ppo.age = rs.getInt(7);
				ppo.exp = rs.getInt(8);
				ppo.school = new String(rs.getString(9).getBytes("ISO-8859-1"),"utf-8");
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
			String sql = "SELECT distinct t_player.name,uniformNum,t_player.position,height,weight,birth,age,exp,school,team FROM (t_player inner join (select name,team from t_detail)as subtable on t_player.name=subtable.name) where team = '"+abb+"'";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {     System.out.println(rs.getString(10));
				PlayerPO po = new PlayerPO();
				po.name = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				po.uniformNum = rs.getInt(2);
				po.position = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.height = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.weight = rs.getDouble(5);
				po.birth = new String(rs.getString(6).getBytes("ISO-8859-1"),"utf-8");
				po.age = rs.getInt(7);
				po.exp = rs.getInt(8);
				po.school = new String(rs.getString(9).getBytes("ISO-8859-1"),"utf-8");
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

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

import PO.PlayerTechPO;
import dataservice.PlayerTechDataService;
public class PlayerTechData extends UnicastRemoteObject implements PlayerTechDataService,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PlayerTechData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//选择某个条件升序,返回升序后的球员数据列表
	public ArrayList<PlayerTechPO> ascend(String en){
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			String sql = "select * from t_playerdata order by ? ";
			Statement st = conn.createStatement();
			sql = sql.replace("?", en);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.index = rs.getInt(1);
				po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(5);
				po.startingNum = rs.getInt(6);
				po.rebound = rs.getInt(7);
				po.secondaryAttack = rs.getInt(8);
				po.time = rs.getInt(9);
				po.shotInRate = rs.getDouble(10);
				po.threeShotInRate = rs.getDouble(11);
				po.penaltyShotInRate = rs.getDouble(12);
				po.offensiveNum = rs.getInt(13);
				po.defensiveNum = rs.getInt(14);
				po.steal = rs.getInt(15);
				po.blockShot = rs.getInt(16);
				po.fault = rs.getInt(17);
				po.foul = rs.getInt(18);
				po.score = rs.getInt(19);
				po.efficiency = rs.getDouble(20);
				po.GmScEfficiency = rs.getDouble(21);
				po.trueShotInRate = rs.getDouble(22);
				po.shootingEfficiency = rs.getDouble(23);
				po.reboundRate = rs.getDouble(24);
				po.offensiveReboundRate = rs.getDouble(25);
				po.defensiveReboundRate = rs.getDouble(26);
				po.secondaryAttackRate = rs.getDouble(27);
				po.stealRate = rs.getDouble(28);
				po.blockShotRate = rs.getDouble(29);
				po.faultRate = rs.getDouble(30);
				po.usageRate = rs.getDouble(31);
				po.shotIn = rs.getInt(32);
				po.shot = rs.getInt(33);
				po.threeShotIn = rs.getInt(34);
				po.threeShot = rs.getInt(35);
				po.penaltyShotIn = rs.getInt(36);
				po.penaltyShot = rs.getInt(37);
				po.teamAllTime = rs.getInt(38);
				po.teamOffensiveRebound = rs.getInt(39);
				po.teamDefensiveRebound = rs.getInt(40);
				po.opponentOffensiveRebound = rs.getInt(41);
				po.opponentDefensiveRebound = rs.getInt(42);
				po.teamShotIn = rs.getInt(43);
				po.opponentOffensiveNum = rs.getInt(44);
				po.opponentTwoShot = rs.getInt(45);
				po.teamShot = rs.getInt(46);
				po.teamPenaltyShot = rs.getInt(47);
				po.teamFault = rs.getInt(48);
				list.add(po);
			}
			System.out.println("acsend playerTech");
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

	//选择某个条件降序,返回降序后的球员数据列表
	public ArrayList<PlayerTechPO>descend(String en){
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			String sql = "select * from t_playerdata order by ? DESC";
			Statement st = conn.createStatement();
			sql = sql.replace("?", en);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.index = rs.getInt(1);
				po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(5);
				po.startingNum = rs.getInt(6);
				po.rebound = rs.getInt(7);
				po.secondaryAttack = rs.getInt(8);
				po.time = rs.getInt(9);
				po.shotInRate = rs.getDouble(10);
				po.threeShotInRate = rs.getDouble(11);
				po.penaltyShotInRate = rs.getDouble(12);
				po.offensiveNum = rs.getInt(13);
				po.defensiveNum = rs.getInt(14);
				po.steal = rs.getInt(15);
				po.blockShot = rs.getInt(16);
				po.fault = rs.getInt(17);
				po.foul = rs.getInt(18);
				po.score = rs.getInt(19);
				po.efficiency = rs.getDouble(20);
				po.GmScEfficiency = rs.getDouble(21);
				po.trueShotInRate = rs.getDouble(22);
				po.shootingEfficiency = rs.getDouble(23);
				po.reboundRate = rs.getDouble(24);
				po.offensiveReboundRate = rs.getDouble(25);
				po.defensiveReboundRate = rs.getDouble(26);
				po.secondaryAttackRate = rs.getDouble(27);
				po.stealRate = rs.getDouble(28);
				po.blockShotRate = rs.getDouble(29);
				po.faultRate = rs.getDouble(30);
				po.usageRate = rs.getDouble(31);
				po.shotIn = rs.getInt(32);
				po.shot = rs.getInt(33);
				po.threeShotIn = rs.getInt(34);
				po.threeShot = rs.getInt(35);
				po.penaltyShotIn = rs.getInt(36);
				po.penaltyShot = rs.getInt(37);
				po.teamAllTime = rs.getInt(38);
				po.teamOffensiveRebound = rs.getInt(39);
				po.teamDefensiveRebound = rs.getInt(40);
				po.opponentOffensiveRebound = rs.getInt(41);
				po.opponentDefensiveRebound = rs.getInt(42);
				po.teamShotIn = rs.getInt(43);
				po.opponentOffensiveNum = rs.getInt(44);
				po.opponentTwoShot = rs.getInt(45);
				po.teamShot = rs.getInt(46);
				po.teamPenaltyShot = rs.getInt(47);
				po.teamFault = rs.getInt(48);
				list.add(po);
			}
			System.out.println("desc playerTech");
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
	public ArrayList<PlayerTechPO> sift(String position, String division,
			String sort) throws RemoteException {
		/* 根据条件筛选并排序
		* 可用作筛选条件的有：球员位置，球员联盟
		* 可用作排序条件的有：球员名称，所属球队，参赛场数，先发场数，篮板数，助攻数，在场时间，投篮命中率，三分命中率，罚球命中率，进攻数，防守数，抢断数，盖帽数，失误数，犯规数，得分，效率，GmSc效率值，真实命中率，投篮效率，篮板率，进攻篮板率，防守篮板率，助攻率，抢断率，盖帽率，失误率，使用率
		* 筛选条件作为特定属性存入ptpo
		* 排序条件则为该项属性非0
		* */
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			String sql = "select # from t_playerdata where (name in(select name from t_player where position = '"+position+"')) AND (team in (select abbreviation from t_team where division='"+division+"'))order by ? DESC limit 50";
			if(sort.equals("srs")){
            	sql = sql.replace("#", "*,score+rebound+secondaryAttack");
            	sql = sql.replace("?","score+rebound+secondaryAttack");
            }
			else{
				sql = sql.replace("#", "*");
            	sql = sql.replace("?",sort);
			}
			Statement st = conn.createStatement(); 
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.index = rs.getInt(1);
				po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(5);
				po.startingNum = rs.getInt(6);
				po.rebound = rs.getInt(7);
				po.secondaryAttack = rs.getInt(8);
				po.time = rs.getInt(9);
				po.shotInRate = rs.getDouble(10);
				po.threeShotInRate = rs.getDouble(11);
				po.penaltyShotInRate = rs.getDouble(12);
				po.offensiveNum = rs.getInt(13);
				po.defensiveNum = rs.getInt(14);
				po.steal = rs.getInt(15);
				po.blockShot = rs.getInt(16);
				po.fault = rs.getInt(17);
				po.foul = rs.getInt(18);
				po.score = rs.getInt(19);
				po.efficiency = rs.getDouble(20);
				po.GmScEfficiency = rs.getDouble(21);
				po.trueShotInRate = rs.getDouble(22);
				po.shootingEfficiency = rs.getDouble(23);
				po.reboundRate = rs.getDouble(24);
				po.offensiveReboundRate = rs.getDouble(25);
				po.defensiveReboundRate = rs.getDouble(26);
				po.secondaryAttackRate = rs.getDouble(27);
				po.stealRate = rs.getDouble(28);
				po.blockShotRate = rs.getDouble(29);
				po.faultRate = rs.getDouble(30);
				po.usageRate = rs.getDouble(31);
				po.shotIn = rs.getInt(32);
				po.shot = rs.getInt(33);
				po.threeShotIn = rs.getInt(34);
				po.threeShot = rs.getInt(35);
				po.penaltyShotIn = rs.getInt(36);
				po.penaltyShot = rs.getInt(37);
				po.teamAllTime = rs.getInt(38);
				po.teamOffensiveRebound = rs.getInt(39);
				po.teamDefensiveRebound = rs.getInt(40);
				po.opponentOffensiveRebound = rs.getInt(41);
				po.opponentDefensiveRebound = rs.getInt(42);
				po.teamShotIn = rs.getInt(43);
				po.opponentOffensiveNum = rs.getInt(44);
				po.opponentTwoShot = rs.getInt(45);
				po.teamShot = rs.getInt(46);
				po.teamPenaltyShot = rs.getInt(47);
				po.teamFault = rs.getInt(48);
				list.add(po);
			}
			System.out.println("sift");
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

	public ArrayList<PlayerTechPO> doubledouble(String position, String division,
			String doubledouble){
		ArrayList<PlayerTechPO> res = new ArrayList<PlayerTechPO>();
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
					String sql = "select * from t_playerdata where (( name in(select name from t_player where position = 'F')) AND (team in (select abbreviation from t_team where division='E')) AND ( (rebound>10 and (secondaryAttack>10 or score>10 or steal>10 or blockShot>10)) or(secondaryAttack>10 and (rebound>10 or score>10 or steal>10 or blockShot>10)) or(score>10 and (secondaryAttack>10 or rebound>10 or steal>10 or blockShot>10)) or(steal>10 and (secondaryAttack>10 or score>10 or rebound>10 or blockShot>10)) or(blockShot>10 and (secondaryAttack>10 or score>10 or steal>10 or rebound>10))))";
				    Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					while(rs.next()){
						PlayerTechPO po = new PlayerTechPO();
						po.index = rs.getInt(1);
						po.name = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
						po.season = new String(rs.getString(3).getBytes("ISO-8859-1"),"utf-8");
						po.team = new String(rs.getString(4).getBytes("ISO-8859-1"),"utf-8");
						po.gameNum = rs.getInt(5);
						po.startingNum = rs.getInt(6);
						po.rebound = rs.getInt(7);
						po.secondaryAttack = rs.getInt(8);
						po.time = rs.getInt(9);
						po.shotInRate = rs.getDouble(10);
						po.threeShotInRate = rs.getDouble(11);
						po.penaltyShotInRate = rs.getDouble(12);
						po.offensiveNum = rs.getInt(13);
						po.defensiveNum = rs.getInt(14);
						po.steal = rs.getInt(15);
						po.blockShot = rs.getInt(16);
						po.fault = rs.getInt(17);
						po.foul = rs.getInt(18);
						po.score = rs.getInt(19);
						po.efficiency = rs.getDouble(20);
						po.GmScEfficiency = rs.getDouble(21);
						po.trueShotInRate = rs.getDouble(22);
						po.shootingEfficiency = rs.getDouble(23);
						po.reboundRate = rs.getDouble(24);
						po.offensiveReboundRate = rs.getDouble(25);
						po.defensiveReboundRate = rs.getDouble(26);
						po.secondaryAttackRate = rs.getDouble(27);
						po.stealRate = rs.getDouble(28);
						po.blockShotRate = rs.getDouble(29);
						po.faultRate = rs.getDouble(30);
						po.usageRate = rs.getDouble(31);
						po.shotIn = rs.getInt(32);
						po.shot = rs.getInt(33);
						po.threeShotIn = rs.getInt(34);
						po.threeShot = rs.getInt(35);
						po.penaltyShotIn = rs.getInt(36);
						po.penaltyShot = rs.getInt(37);
						po.teamAllTime = rs.getInt(38);
						po.teamOffensiveRebound = rs.getInt(39);
						po.teamDefensiveRebound = rs.getInt(40);
						po.opponentOffensiveRebound = rs.getInt(41);
						po.opponentDefensiveRebound = rs.getInt(42);
						po.teamShotIn = rs.getInt(43);
						po.opponentOffensiveNum = rs.getInt(44);
						po.opponentTwoShot = rs.getInt(45);
						po.teamShot = rs.getInt(46);
						po.teamPenaltyShot = rs.getInt(47);
						po.teamFault = rs.getInt(48);
						res.add(po);
					}
					System.out.println("doubledouble");
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
				return res;
	}
}
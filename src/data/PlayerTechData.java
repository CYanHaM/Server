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
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum en){
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_team order by ?");
			switch(en) {
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
			ResultSet rs = cmd.executeQuery();
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.name = rs.getString(1);
				po.team = rs.getString(2);
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getString(7);
				po.shotInRate = rs.getDouble(8);
				po.threeShotInRate = rs.getDouble(9);
				po.penaltyShotInRate = rs.getDouble(10);
				po.offensiveNum = rs.getInt(11);
				po.defensiveNum = rs.getInt(12);
				po.steal = rs.getInt(13);
				po.blockShot = rs.getInt(14);
				po.fault = rs.getInt(15);
				po.foul = rs.getInt(16);
				po.score = rs.getInt(17);
				po.efficiency = rs.getDouble(18);
				po.GmScEfficiency = rs.getDouble(19);
				po.trueShotInRate = rs.getDouble(20);
				po.shootingEfficiency = rs.getDouble(21);
				po.reboundRate = rs.getDouble(22);
				po.offensiveReboundRate = rs.getDouble(23);
				po.defensiveReboundRate = rs.getDouble(24);
				po.secondaryAttackRate = rs.getDouble(25);
				po.stealRate = rs.getDouble(26);
				po.blockShotRate = rs.getDouble(27);
				po.faultRate = rs.getDouble(28);
				po.usageRate = rs.getDouble(29);
				list.add(po);
			}
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
	public ArrayList<PlayerTechPO>descend(PlayerTechEnum en){
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_team order by ? DESC");
			switch(en) {
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
			ResultSet rs = cmd.executeQuery();
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.name = rs.getString(1);
				po.team = rs.getString(2);
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getString(7);
				po.shotInRate = rs.getDouble(8);
				po.threeShotInRate = rs.getDouble(9);
				po.penaltyShotInRate = rs.getDouble(10);
				po.offensiveNum = rs.getInt(11);
				po.defensiveNum = rs.getInt(12);
				po.steal = rs.getInt(13);
				po.blockShot = rs.getInt(14);
				po.fault = rs.getInt(15);
				po.foul = rs.getInt(16);
				po.score = rs.getInt(17);
				po.efficiency = rs.getDouble(18);
				po.GmScEfficiency = rs.getDouble(19);
				po.trueShotInRate = rs.getDouble(20);
				po.shootingEfficiency = rs.getDouble(21);
				po.reboundRate = rs.getDouble(22);
				po.offensiveReboundRate = rs.getDouble(23);
				po.defensiveReboundRate = rs.getDouble(24);
				po.secondaryAttackRate = rs.getDouble(25);
				po.stealRate = rs.getDouble(26);
				po.blockShotRate = rs.getDouble(27);
				po.faultRate = rs.getDouble(28);
				po.usageRate = rs.getDouble(29);
				list.add(po);
			}
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
	public ArrayList<PlayerTechPO> sift(PlayerTechPO ptpo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

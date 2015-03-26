package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;
import dataservice.PlayerTechDataService;

public class PlayerTechData implements PlayerTechDataService {
	//ѡ��ĳ����������,������������Ա�����б�
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum en){
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_playerdata order by ? ");
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
				po.name = new String(rs.getString(0).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getInt(7);
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
				po.shotIn = rs.getInt(30);
				po.shot = rs.getInt(31);
				po.threeShotIn = rs.getInt(32);
				po.threeShot = rs.getInt(33);
				po.penaltyShotIn = rs.getInt(34);
				po.penaltyShot = rs.getInt(35);
				po.teamAllTime = rs.getInt(36);
				po.teamOffensiveRebound = rs.getInt(37);
				po.teamDefensiveRebound = rs.getInt(38);
				po.opponentOffensiveRebound = rs.getInt(39);
				po.opponentDefensiveRebound = rs.getInt(40);
				po.teamShotIn = rs.getInt(41);
				po.opponentOffensiveNum = rs.getInt(42);
				po.opponentTwoShot = rs.getInt(43);
				po.teamShot = rs.getInt(44);
				po.teamPenaltyShot = rs.getInt(45);
				po.teamFault = rs.getInt(46);
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
	

	//ѡ��ĳ����������,���ؽ�������Ա�����б�
	public ArrayList<PlayerTechPO>descend(PlayerTechEnum en){
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_playerdata order by ? DESC");
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
				po.name = new String(rs.getString(0).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getInt(7);
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
				po.shotIn = rs.getInt(30);
				po.shot = rs.getInt(31);
				po.threeShotIn = rs.getInt(32);
				po.threeShot = rs.getInt(33);
				po.penaltyShotIn = rs.getInt(34);
				po.penaltyShot = rs.getInt(35);
				po.teamAllTime = rs.getInt(36);
				po.teamOffensiveRebound = rs.getInt(37);
				po.teamDefensiveRebound = rs.getInt(38);
				po.opponentOffensiveRebound = rs.getInt(39);
				po.opponentDefensiveRebound = rs.getInt(40);
				po.teamShotIn = rs.getInt(41);
				po.opponentOffensiveNum = rs.getInt(42);
				po.opponentTwoShot = rs.getInt(43);
				po.teamShot = rs.getInt(44);
				po.teamPenaltyShot = rs.getInt(45);
				po.teamFault = rs.getInt(46);
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
	public ArrayList<PlayerTechPO> sift(String position, String division,
			PlayerTechPO ptpo) {
		/* ��������ɸѡ������
		 * ������ɸѡ�������У���Աλ�ã���Ա����
		 * �����������������У���Ա���ƣ�������ӣ������������ȷ������������������������ڳ�ʱ�䣬Ͷ�������ʣ����������ʣ����������ʣ���������������������������ñ����ʧ���������������÷֣�Ч�ʣ�GmScЧ��ֵ����ʵ�����ʣ�Ͷ��Ч�ʣ������ʣ����������ʣ����������ʣ������ʣ������ʣ���ñ�ʣ�ʧ���ʣ�ʹ����
		 * ɸѡ������Ϊ�ض����Դ���ptpo
		 * ����������Ϊ�������Է�0
		 * */
		ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
			PreparedStatement cmd = conn.
					prepareStatement("select * from t_playerdata where name in(select name from t_player where position='"+position+"')AND team in (select abbreviation from t_team where division='"+division+"') order by ? DESC limit 50");
		
			if(ptpo.gameNum!=0){
				cmd.setInt(1, ptpo.gameNum);
			}else if(ptpo.startingNum!=0){
				cmd.setInt(1,ptpo.startingNum);
			}else if(ptpo.rebound!=0){
				cmd.setInt(1,ptpo.rebound);
			}else if(ptpo.secondaryAttack!=0){
				cmd.setInt(1,ptpo.secondaryAttack);
			}else if(ptpo.time!=0){
				cmd.setInt(1,ptpo.time);
			}else if(ptpo.shotInRate!=0){
				cmd.setDouble(1, ptpo.shotInRate);
			}else if(ptpo.threeShotInRate!=0){
				cmd.setDouble(1, ptpo.threeShotInRate);
			}else if(ptpo.penaltyShotInRate!=0){
				cmd.setDouble(1, ptpo.penaltyShotInRate);
			}else if(ptpo.offensiveNum!=0){
				cmd.setInt(1,ptpo.offensiveNum);
			}else if(ptpo.defensiveNum!=0){
				cmd.setInt(1, ptpo.defensiveNum);
			}else if(ptpo.steal!=0){
				cmd.setInt(1, ptpo.steal);
			}else if(ptpo.blockShot!=0){
				cmd.setInt(1, ptpo.blockShot);
			}else if(ptpo.fault!=0){
				cmd.setInt(1, ptpo.fault);
			}else if(ptpo.foul!=0){
				cmd.setInt(1, ptpo.foul);
			}else if(ptpo.score!=0){
				cmd.setInt(1, ptpo.score);
			}else if(ptpo.efficiency!=0){
				cmd.setDouble(1, ptpo.efficiency);
			}else if(ptpo.GmScEfficiency!=0){
				cmd.setDouble(1, ptpo.GmScEfficiency);
			}else if(ptpo.trueShotInRate!=0){
				cmd.setDouble(1, ptpo.trueShotInRate);
			}else if(ptpo.shootingEfficiency!=0){
				cmd.setDouble(1, ptpo.shootingEfficiency);
			}else if(ptpo.reboundRate!=0){
				cmd.setDouble(1, ptpo.reboundRate);
			}else if(ptpo.offensiveReboundRate!=0){
				cmd.setDouble(1, ptpo.offensiveReboundRate);
			}else if(ptpo.defensiveReboundRate!=0){
				cmd.setDouble(1, ptpo.defensiveReboundRate);
			}else if(ptpo.secondaryAttackRate!=0){
				cmd.setDouble(1, ptpo.secondaryAttackRate);
			}else if(ptpo.stealRate!=0){
				cmd.setDouble(1, ptpo.stealRate);
			}else if(ptpo.blockShotRate!=0){
				cmd.setDouble(1, ptpo.blockShotRate);
			}else if(ptpo.faultRate!=0){
				cmd.setDouble(1, ptpo.faultRate);
			}else if(ptpo.usageRate!=0){
				cmd.setDouble(1, ptpo.usageRate);
			}
			ResultSet rs = cmd.executeQuery();
			while(rs.next()){
				PlayerTechPO po = new PlayerTechPO();
				po.name = new String(rs.getString(0).getBytes("ISO-8859-1"),"utf-8");
				po.season = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
				po.team = new String(rs.getString(2).getBytes("ISO-8859-1"),"utf-8");
				po.gameNum = rs.getInt(3);
				po.startingNum = rs.getInt(4);
				po.rebound = rs.getInt(5);
				po.secondaryAttackRate = rs.getInt(6);
				po.time = rs.getInt(7);
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
				po.shotIn = rs.getInt(30);
				po.shot = rs.getInt(31);
				po.threeShotIn = rs.getInt(32);
				po.threeShot = rs.getInt(33);
				po.penaltyShotIn = rs.getInt(34);
				po.penaltyShot = rs.getInt(35);
				po.teamAllTime = rs.getInt(36);
				po.teamOffensiveRebound = rs.getInt(37);
				po.teamDefensiveRebound = rs.getInt(38);
				po.opponentOffensiveRebound = rs.getInt(39);
				po.opponentDefensiveRebound = rs.getInt(40);
				po.teamShotIn = rs.getInt(41);
				po.opponentOffensiveNum = rs.getInt(42);
				po.opponentTwoShot = rs.getInt(43);
				po.teamShot = rs.getInt(44);
				po.teamPenaltyShot = rs.getInt(45);
				po.teamFault = rs.getInt(46);
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
	
}

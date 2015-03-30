package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

public class dealWithSql implements SQLservice {
@Override
public ArrayList<PlayerTechPO> getPlayerTech() {
// TODO Auto-generated method stub
ArrayList<PlayerTechPO> list = new ArrayList<PlayerTechPO>();
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
String sql = "SELECT * FROM t_playerdata";
ResultSet rs = statement.executeQuery(sql);
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
@Override
public ArrayList<TeamTechPO> getTeamTech() {
// TODO Auto-generated method stub
ArrayList<TeamTechPO> list = new ArrayList<TeamTechPO>();
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
String sql = "SELECT * FROM t_seasondata";
ResultSet rs = statement.executeQuery(sql);
while(rs.next()){
TeamTechPO po = new TeamTechPO();
po.name = new String(rs.getString(0).getBytes("ISO-8859-1"),"utf-8");
po.season = new String(rs.getString(1).getBytes("ISO-8859-1"),"utf-8");
po.gameNum = rs.getInt(2);
po.shotInNum = rs.getInt(3);
po.shotNum = rs.getInt(4);
po.threeShotInNum = rs.getInt(5);
po.threeShotNum = rs.getInt(6);
po.penaltyShotInNum = rs.getInt(7);
po.penaltyShotNum = rs.getInt(8);
po.offensiveRebound = rs.getInt(9);
po.defensiveRebound = rs.getInt(10);
po.rebound = rs.getInt(11);
po.secondaryAttack = rs.getInt(12);
po.steal = rs.getInt(13);
po.blockShot = rs.getInt(14);
po.fault = rs.getInt(15);
po.foul = rs.getInt(16);
po.score = rs.getInt(17);
po.shotInRate = rs.getDouble(18);
po.threeShotInRate = rs.getDouble(19);
po.penaltyShotInRate = rs.getDouble(20);
po.winningRate = rs.getDouble(21);
po.winningRate = rs.getDouble(22);
po.offensiveRound = rs.getDouble(23);
po.offensiveEfficiency = rs.getDouble(24);
po.defensiveEfficiency = rs.getDouble(25);
po.reboundEfficiency = rs.getDouble(26);
po.stealEfficiency = rs.getDouble(27);
po.secondaryAttackEfficiency = rs.getDouble(28);
po.opponentDefensiveRebound = rs.getInt(29);
po.opponentOffensiveRebound = rs.getInt(30);
po.opponentOffensiveRound = rs.getInt(31);
po.opponentScore = rs.getInt(32);
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
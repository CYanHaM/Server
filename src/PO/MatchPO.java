package PO;
import java.io.Serializable;
import java.util.ArrayList;


public class MatchPO implements Serializable{
	
	/**
	 * 每场比赛的数据
	 */
	public static final long serialVersionUID = 1L;
	public String season;                                 //赛季
	public String date;                                   //日期
	public String homeTeam;                               //主场队伍
	public String guestTeam;                              //客场队伍
	public String score;                                  //比分
	public String score1;                                 //第一节比分
	public String score2;                                 //第二节比分
	public String score3;                                 //第三节比分
	public String score4;                                 //第四节比分
	public String scoreExtra;                             //加时赛比分
	public ArrayList<PlayerTechMPO> playerStatistic;    //球员技术统计
	
	
	
	

}

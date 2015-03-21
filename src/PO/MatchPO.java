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
	public ArrayList<PlayerTechMPO> playerStatistic;      //球员技术统计
	public int ifHomeTeamWin;                         //主队是否胜利
	public int ifGuestTeamWin;                        //客队是否胜利
	public int homeTeamDeffensiveRebound;              //主队防守篮板
	public int guestTeamDeffensiveRebound;              //客队防守篮板
	public int homeTeamOffensiveRebound;              //主队进攻篮板
	public int guestTeamOffensiveRebound;              //客队进攻篮板
	public double homeTeamOffensiveRound;              //主队进攻回合
	public double guestTeamOffensiveRound;              //客队进攻回合
	public int homeScore;               //主队得分
	public int guestScore;               //客队得分
	public int homeAllTime;              //主队全员上场时间
	public int guestAllTime;             //客队全员上场时间
	public int homeShotIn;              //主队总进球数
	public int guestShotIn;              //客队总进球数
	public int homeTwoShot;             //主队两分出手次数
	public int guestTwoShot;            //客队两分出手次数
	public int homeShot;             //主队出手次数
	public int guestShot;            //客队出手次数
	public int homePenaltyShot;         //主队罚球次数
	public int guestPenaltyShot;        //客队罚球次数
	public int homeFoul;                //主队失误次数
	public int guestFoul;               //客队失误次数

}

package PO;
import java.io.Serializable;
import java.util.ArrayList;


public class MatchPo implements Serializable{
	
	/**
	 * 每场比赛的数据
	 */
	private static final long serialVersionUID = 1L;
	private String season;                                 //赛季
	private String date;                                   //日期
	private String homeTeam;                               //主场队伍
	private String guestTeam;                              //客场队伍
	private String score;                                  //比分
	private String score1;                                 //第一节比分
	private String score2;                                 //第二节比分
	private String score3;                                 //第三节比分
	private String score4;                                 //第四节比分
	private String scoreExtra;                             //加时赛比分
	private ArrayList<PlayerDataMPo> playerStatistic;    //球员技术统计
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getGuestTeam() {
		return guestTeam;
	}
	public void setGuestTeam(String guestTeam) {
		this.guestTeam = guestTeam;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getScore1() {
		return score1;
	}
	public void setScore1(String score1) {
		this.score1 = score1;
	}
	public String getScore2() {
		return score2;
	}
	public void setScore2(String score2) {
		this.score2 = score2;
	}
	public String getScore3() {
		return score3;
	}
	public void setScore3(String score3) {
		this.score3 = score3;
	}
	public String getScore4() {
		return score4;
	}
	public void setScore4(String score4) {
		this.score4 = score4;
	}
	public String getScoreExtra() {
		return scoreExtra;
	}
	public void setScoreExtra(String scoreExtra) {
		this.scoreExtra = scoreExtra;
	}
	public ArrayList<PlayerDataMPo> getPlayerStatistic() {
		return playerStatistic;
	}
	public void setPlayerStatistic(ArrayList<PlayerDataMPo> playerStatistic) {
		this.playerStatistic = playerStatistic;
	}
	
	

}

package PO;
import java.io.Serializable;

public class PlayerDataMPo implements Serializable{
	
	/**
	 *每场比赛球员技术统计 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;                         //姓名
	private String team;                         //队伍
	private String position;                     //位置
	private double time;                         //在场时间
	private double shotIn;                       //投篮命中数
	private double shot;                         //投篮出手数
	private double threeShotIn;                  //三分命中数
	private double threeShot;                    //三分出手数
	private double penaltyShotIn;                //罚球命中数
	private double penaltyShot;                  //发球出手数
	private double offensiveRebound;             //前场篮板数
	private double defensiveRebound;             //后场篮板数
	private double rebound;                      //总篮板数
	private double secondaryAttack;              //助攻数
	private double steal;                        //抢断数
	private double blockShot;                    //盖帽数
	private double fault;                        //失误数
	private double foul;                         //犯规数
	private double score;                        //个人得分
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getShotIn() {
		return shotIn;
	}
	public void setShotIn(double shotIn) {
		this.shotIn = shotIn;
	}
	public double getShot() {
		return shot;
	}
	public void setShot(double shot) {
		this.shot = shot;
	}
	public double getThreeShotIn() {
		return threeShotIn;
	}
	public void setThreeShotIn(double threeShotIn) {
		this.threeShotIn = threeShotIn;
	}
	public double getThreeShot() {
		return threeShot;
	}
	public void setThreeShot(double threeShot) {
		this.threeShot = threeShot;
	}
	public double getPenaltyShotIn() {
		return penaltyShotIn;
	}
	public void setPenaltyShotIn(double penaltyShotIn) {
		this.penaltyShotIn = penaltyShotIn;
	}
	public double getPenaltyShot() {
		return penaltyShot;
	}
	public void setPenaltyShot(double penaltyShot) {
		this.penaltyShot = penaltyShot;
	}
	public double getOffensiveRebound() {
		return offensiveRebound;
	}
	public void setOffensiveRebound(double offensiveRebound) {
		this.offensiveRebound = offensiveRebound;
	}
	public double getDefensiveRebound() {
		return defensiveRebound;
	}
	public void setDefensiveRebound(double defensiveRebound) {
		this.defensiveRebound = defensiveRebound;
	}
	public double getRebound() {
		return rebound;
	}
	public void setRebound(double rebound) {
		this.rebound = rebound;
	}
	public double getSecondaryAttack() {
		return secondaryAttack;
	}
	public void setSecondaryAttack(double secondaryAttack) {
		this.secondaryAttack = secondaryAttack;
	}
	public double getSteal() {
		return steal;
	}
	public void setSteal(double steal) {
		this.steal = steal;
	}
	public double getBlockShot() {
		return blockShot;
	}
	public void setBlockShot(double blockShot) {
		this.blockShot = blockShot;
	}
	public double getFault() {
		return fault;
	}
	public void setFault(double fault) {
		this.fault = fault;
	}
	public double getFoul() {
		return foul;
	}
	public void setFoul(double foul) {
		this.foul = foul;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	

}

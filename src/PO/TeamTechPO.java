package PO;
import java.io.Serializable;


public class TeamTechPO implements Serializable {
	
	/**
	 * 赛季球队总数据
	 */
	private static final long serialVersionUID = 1L;
	private String name;                            //球队名称
	private String season;                          //赛季
	private double gameNum;                         //比赛场数
	private double shotInNum;                       //投篮命中数
	private double shotNum;                         //投篮出手数
	private double threeShotInNum;                  //三分命中数
	private double threeShotNum;                    //三分出手数
	private double penaltyShotInNum;                //罚球命中数
	private double penaltyShotNum;                  //发球出手数
	private double offensiveRebound;                //前场篮板数
	private double defensiveRebound;                //后场篮板数
	private double rebound;                         //总篮板数
	private double secondaryAttack;                 //助攻数
	private double steal;                           //抢断数
	private double blockShot;                       //盖帽数
	private double fault;                           //失误数
	private double foul;                            //犯规数
	private double score;                           //比赛得分
	private double shotInRate;                      //投篮命中率
	private double threeShotInRate;                 //三分命中率
	private double penaltyShotInRate;               //罚球命中率
	private double winningRate;                     //胜率
	private double offensiveRound;                  //进攻回合
	private double offensiveEffiency;               //进攻效率
	private double defensiveEffiency;               //防守效率
	private double reboundEffiency;                 //篮板效率
	private double stealEffiency;                   //抢断效率
	private double secondaryAttackEffiency;         //助攻效率
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public double getGameNum() {
		return gameNum;
	}
	public void setGameNum(double gameNum) {
		this.gameNum = gameNum;
	}
	public double getShotInNum() {
		return shotInNum;
	}
	public void setShotInNum(double shotInNum) {
		this.shotInNum = shotInNum;
	}
	public double getShotNum() {
		return shotNum;
	}
	public void setShotNum(double shotNum) {
		this.shotNum = shotNum;
	}
	public double getThreeShotInNum() {
		return threeShotInNum;
	}
	public void setThreeShotInNum(double threeShotInNum) {
		this.threeShotInNum = threeShotInNum;
	}
	public double getThreeShotNum() {
		return threeShotNum;
	}
	public void setThreeShotNum(double threeShotNum) {
		this.threeShotNum = threeShotNum;
	}
	public double getPenaltyShotInNum() {
		return penaltyShotInNum;
	}
	public void setPenaltyShotInNum(double penaltyShotInNum) {
		this.penaltyShotInNum = penaltyShotInNum;
	}
	public double getPenaltyShotNum() {
		return penaltyShotNum;
	}
	public void setPenaltyShotNum(double penaltyShotNum) {
		this.penaltyShotNum = penaltyShotNum;
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
	public double getShotInRate() {
		return shotInRate;
	}
	public void setShotInRate(double shotInRate) {
		this.shotInRate = shotInRate;
	}
	public double getThreeShotInRate() {
		return threeShotInRate;
	}
	public void setThreeShotInRate(double threeShotInRate) {
		this.threeShotInRate = threeShotInRate;
	}
	public double getPenaltyShotInRate() {
		return penaltyShotInRate;
	}
	public void setPenaltyShotInRate(double penaltyShotInRate) {
		this.penaltyShotInRate = penaltyShotInRate;
	}
	public double getWinningRate() {
		return winningRate;
	}
	public void setWinningRate(double winningRate) {
		this.winningRate = winningRate;
	}
	public double getOffensiveRound() {
		return offensiveRound;
	}
	public void setOffensiveRound(double offensiveRound) {
		this.offensiveRound = offensiveRound;
	}
	public double getOffensiveEffiency() {
		return offensiveEffiency;
	}
	public void setOffensiveEffiency(double offensiveEffiency) {
		this.offensiveEffiency = offensiveEffiency;
	}
	public double getDefensiveEffiency() {
		return defensiveEffiency;
	}
	public void setDefensiveEffiency(double defensiveEffiency) {
		this.defensiveEffiency = defensiveEffiency;
	}
	public double getReboundEffiency() {
		return reboundEffiency;
	}
	public void setReboundEffiency(double reboundEffiency) {
		this.reboundEffiency = reboundEffiency;
	}
	public double getStealEffiency() {
		return stealEffiency;
	}
	public void setStealEffiency(double stealEffiency) {
		this.stealEffiency = stealEffiency;
	}
	public double getSecondaryAttackEffiency() {
		return secondaryAttackEffiency;
	}
	public void setSecondaryAttackEffiency(double secondaryAttackEffiency) {
		this.secondaryAttackEffiency = secondaryAttackEffiency;
	}
	
}

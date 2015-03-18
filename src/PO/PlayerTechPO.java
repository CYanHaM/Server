package PO;
import java.io.Serializable;


public class PlayerTechPO implements Serializable{
	/**
	 * 赛季球员总数据
	 */
	private static final long serialVersionUID = 1L;
	private String name;                            //球员名称
	private String season;                          //赛季
	private String team;                            //所属球队
	private double gameNum;                         //参赛场数
	private double startingNum;                     //先发场数
	private double rebound;                         //篮板数
	private double secondaryAttack;                 //助攻数
	private double time;                            //在场时间
	private double shotInRate;                      //投篮命中率
	private double threeShotInRate;                 //三分命中率
	private double penaltyShotInRate;               //罚球命中率
	private double offensiveNum;                    //进攻数
	private double defensiveNum;                    //防守数
	private double steal;                           //抢断数
	private double blockShot;                       //盖帽数
	private double fault;                           //失误数
	private double foul;                            //犯规数
	private double score;                           //得分
	private double effiency;                        //效率
	private double GmScEffiency;                    //GmSc效率值
	private double trueShotInRate;                  //真实命中率
	private double shootingEffiency;                //投篮效率
	private double reboundRate;                     //篮板率
	private double offensiveReboundRate;            //进攻篮板率
	private double defensiveReboundRate;            //防守篮板率
	private double secondaryAttackRate;             //助攻数
	private double stealRate;                       //抢断数
	private double blockShotRate;                   //盖帽数
	private double faultRate;                       //失误数	
	private double usageRate;                       //使用率
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
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public double getGameNum() {
		return gameNum;
	}
	public void setGameNum(double gameNum) {
		this.gameNum = gameNum;
	}
	public double getStartingNum() {
		return startingNum;
	}
	public void setStartingNum(double startingNum) {
		this.startingNum = startingNum;
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
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
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
	public double getOffensiveNum() {
		return offensiveNum;
	}
	public void setOffensiveNum(double offensiveNum) {
		this.offensiveNum = offensiveNum;
	}
	public double getDefensiveNum() {
		return defensiveNum;
	}
	public void setDefensiveNum(double defensiveNum) {
		this.defensiveNum = defensiveNum;
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
	public double getEffiency() {
		return effiency;
	}
	public void setEffiency(double effiency) {
		this.effiency = effiency;
	}
	public double getGmScEffiency() {
		return GmScEffiency;
	}
	public void setGmScEffiency(double gmScEffiency) {
		GmScEffiency = gmScEffiency;
	}
	public double getTrueShotInRate() {
		return trueShotInRate;
	}
	public void setTrueShotInRate(double trueShotInRate) {
		this.trueShotInRate = trueShotInRate;
	}
	public double getShootingEffiency() {
		return shootingEffiency;
	}
	public void setShootingEffiency(double shootingEffiency) {
		this.shootingEffiency = shootingEffiency;
	}
	public double getReboundRate() {
		return reboundRate;
	}
	public void setReboundRate(double reboundRate) {
		this.reboundRate = reboundRate;
	}
	public double getOffensiveReboundRate() {
		return offensiveReboundRate;
	}
	public void setOffensiveReboundRate(double offensiveReboundRate) {
		this.offensiveReboundRate = offensiveReboundRate;
	}
	public double getDefensiveReboundRate() {
		return defensiveReboundRate;
	}
	public void setDefensiveReboundRate(double defensiveReboundRate) {
		this.defensiveReboundRate = defensiveReboundRate;
	}
	public double getSecondaryAttackRate() {
		return secondaryAttackRate;
	}
	public void setSecondaryAttackRate(double secondaryAttackRate) {
		this.secondaryAttackRate = secondaryAttackRate;
	}
	public double getStealRate() {
		return stealRate;
	}
	public void setStealRate(double stealRate) {
		this.stealRate = stealRate;
	}
	public double getBlockShotRate() {
		return blockShotRate;
	}
	public void setBlockShotRate(double blockShotRate) {
		this.blockShotRate = blockShotRate;
	}
	public double getFaultRate() {
		return faultRate;
	}
	public void setFaultRate(double faultRate) {
		this.faultRate = faultRate;
	}
	public double getUsageRate() {
		return usageRate;
	}
	public void setUsageRate(double usageRate) {
		this.usageRate = usageRate;
	}
	

}

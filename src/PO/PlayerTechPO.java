package PO;
import java.io.Serializable;


public class PlayerTechPO implements Serializable{
	/**
	 * ������Ա������
	 */
	private static final long serialVersionUID = 1L;
	private String name;                            //��Ա����
	private String season;                          //����
	private String team;                            //�������
	private double gameNum;                         //��������
	private double startingNum;                     //�ȷ�����
	private double rebound;                         //������
	private double secondaryAttack;                 //������
	private double time;                            //�ڳ�ʱ��
	private double shotInRate;                      //Ͷ��������
	private double threeShotInRate;                 //����������
	private double penaltyShotInRate;               //����������
	private double offensiveNum;                    //������
	private double defensiveNum;                    //������
	private double steal;                           //������
	private double blockShot;                       //��ñ��
	private double fault;                           //ʧ����
	private double foul;                            //������
	private double score;                           //�÷�
	private double effiency;                        //Ч��
	private double GmScEffiency;                    //GmScЧ��ֵ
	private double trueShotInRate;                  //��ʵ������
	private double shootingEffiency;                //Ͷ��Ч��
	private double reboundRate;                     //������
	private double offensiveReboundRate;            //����������
	private double defensiveReboundRate;            //����������
	private double secondaryAttackRate;             //������
	private double stealRate;                       //������
	private double blockShotRate;                   //��ñ��
	private double faultRate;                       //ʧ����	
	private double usageRate;                       //ʹ����
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

package PO;
import java.io.Serializable;


public class TeamDataPo implements Serializable {
	
	/**
	 * �������������
	 */
	private static final long serialVersionUID = 1L;
	private String name;                            //�������
	private String season;                          //����
	private double gameNum;                         //��������
	private double shotInNum;                       //Ͷ��������
	private double shotNum;                         //Ͷ��������
	private double threeShotInNum;                  //����������
	private double threeShotNum;                    //���ֳ�����
	private double penaltyShotInNum;                //����������
	private double penaltyShotNum;                  //���������
	private double offensiveRebound;                //ǰ��������
	private double defensiveRebound;                //��������
	private double rebound;                         //��������
	private double secondaryAttack;                 //������
	private double steal;                           //������
	private double blockShot;                       //��ñ��
	private double fault;                           //ʧ����
	private double foul;                            //������
	private double score;                           //�����÷�
	private double shotInRate;                      //Ͷ��������
	private double threeShotInRate;                 //����������
	private double penaltyShotInRate;               //����������
	private double winningRate;                     //ʤ��
	private double offensiveRound;                  //�����غ�
	private double offensiveEffiency;               //����Ч��
	private double defensiveEffiency;               //����Ч��
	private double reboundEffiency;                 //����Ч��
	private double stealEffiency;                   //����Ч��
	private double secondaryAttackEffiency;         //����Ч��
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

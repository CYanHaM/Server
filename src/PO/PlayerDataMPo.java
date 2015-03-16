package PO;
import java.io.Serializable;

public class PlayerDataMPo implements Serializable{
	
	/**
	 *ÿ��������Ա����ͳ�� 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;                         //����
	private String team;                         //����
	private String position;                     //λ��
	private double time;                         //�ڳ�ʱ��
	private double shotIn;                       //Ͷ��������
	private double shot;                         //Ͷ��������
	private double threeShotIn;                  //����������
	private double threeShot;                    //���ֳ�����
	private double penaltyShotIn;                //����������
	private double penaltyShot;                  //���������
	private double offensiveRebound;             //ǰ��������
	private double defensiveRebound;             //��������
	private double rebound;                      //��������
	private double secondaryAttack;              //������
	private double steal;                        //������
	private double blockShot;                    //��ñ��
	private double fault;                        //ʧ����
	private double foul;                         //������
	private double score;                        //���˵÷�
	
	
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

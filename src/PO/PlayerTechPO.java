package PO;
import java.io.Serializable;


public class PlayerTechPO implements Serializable{
	/**
	 * ������Ա������
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //��Ա����
	public String season;                          //����
	public String team;                            //�������
	public int gameNum;                         //��������
	public int startingNum;                     //�ȷ�����
	public int rebound;                         //������
	public int secondaryAttack;                 //������
	public int time;                            //�ڳ�ʱ��
	public double shotInRate;                      //Ͷ��������
	public double threeShotInRate;                 //����������
	public double penaltyShotInRate;               //����������
	public int offensiveNum;                    //������
	public int defensiveNum;                    //������
	public int steal;                           //������
	public int blockShot;                       //��ñ��
	public int fault;                           //ʧ����
	public int foul;                            //������
	public int score;                           //�÷�
	public double efficiency;                        //Ч��
	public double GmScEfficiency;                    //GmScЧ��ֵ
	public double trueShotInRate;                  //��ʵ������
	public double shootingEfficiency;                //Ͷ��Ч��
	public double reboundRate;                     //������
	public double offensiveReboundRate;            //����������
	public double defensiveReboundRate;            //����������
	public double secondaryAttackRate;             //������
	public double stealRate;                       //������
	public double blockShotRate;                   //��ñ��
	public double faultRate;                       //ʧ����	
	public double usageRate;                       //ʹ����
	public int shotIn;                       //Ͷ��������
	public int shot;                         //Ͷ��������
	public int threeShotIn;                  //����������
	public int threeShot;                    //���ֳ�����
	public int penaltyShotIn;                //����������
	public int penaltyShot;                  //���������
	public int teamAllTime;                  //ȫ���ϳ�ʱ��
	public int teamOffensiveRebound;                  //ȫ�ӽ�������
	public int teamDefensiveRebound;                //ȫ�ӷ�������
	public int opponentOffensiveRebound;                  //���ֽ�������
	public int opponentDefensiveRebound;                //���ַ�������
	public int teamShotIn;                             //ȫ�ӽ�����
	public int opponentOffensiveNum;                     //���ֽ�������
	public int opponentTwoShot;                     //������������ִ���
	public int teamShot;                          //ȫ�ӳ��ִ���
	public int teamPenaltyShot;                   //ȫ�ӷ������
	public int teamFault;                          //ȫ��ʧ�����    

}
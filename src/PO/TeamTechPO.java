package PO;
import java.io.Serializable;


public class TeamTechPO implements Serializable {
	
	/**
	 * �������������
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //�������
	public String season;                          //����
	public double gameNum;                         //��������
	public double shotInNum;                       //Ͷ��������
	public double shotNum;                         //Ͷ��������
	public double threeShotInNum;                  //����������
	public double threeShotNum;                    //���ֳ�����
	public double penaltyShotInNum;                //����������
	public double penaltyShotNum;                  //���������
	public double offensiveRebound;                //ǰ��������
	public double defensiveRebound;                //��������
	public double rebound;                         //��������
	public double secondaryAttack;                 //������
	public double steal;                           //������
	public double blockShot;                       //��ñ��
	public double fault;                           //ʧ����
	public double foul;                            //������
	public double score;                           //�����÷�
	public double shotInRate;                      //Ͷ��������
	public double threeShotInRate;                 //����������
	public double penaltyShotInRate;               //����������
	public double winningRate;                     //ʤ��
	public double offensiveRound;                  //�����غ�
	public double offensiveEfficiency;               //����Ч��
	public double defensiveEfficiency;               //����Ч��
	public double reboundEfficiency;                 //����Ч��
	public double stealEfficiency;                   //����Ч��
	public double secondaryAttackEfficiency;         //����Ч��
	
	
}

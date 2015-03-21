package PO;
import java.io.Serializable;


public class TeamTechPO implements Serializable {
	
	/**
	 * �������������
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //�������
	public String season;                          //����
	public int gameNum;                         //��������
	public int shotInNum;                       //Ͷ��������
	public int shotNum;                         //Ͷ��������
	public int threeShotInNum;                  //����������
	public int threeShotNum;                    //���ֳ�����
	public int penaltyShotInNum;                //����������
	public int penaltyShotNum;                  //���������
	public int offensiveRebound;                //ǰ��������
	public int defensiveRebound;                //��������
	public int rebound;                         //��������
	public int secondaryAttack;                 //������
	public int steal;                           //������
	public int blockShot;                       //��ñ��
	public int fault;                           //ʧ����
	public int foul;                            //������
	public int score;                           //�����÷�
	public double shotInRate;                      //Ͷ��������
	public double threeShotInRate;                 //����������
	public double penaltyShotInRate;               //����������
	public double winningRate;                     //ʤ��
	public int winningNum;                         //ʤ����
	public double offensiveRound;                  //�����غ�
	public double offensiveEfficiency;               //����Ч��
	public double defensiveEfficiency;               //����Ч��
	public double reboundEfficiency;                 //����Ч��
	public double stealEfficiency;                   //����Ч��
	public double secondaryAttackEfficiency;         //����Ч��
	public int opponentDefensiveRebound;          //�Է���������
	public int opponentOffensiveRebound;          //�Է���������
	public double opponentOffensiveRound;        //�Է������غ�
	public int opponentScore;        //�Է��÷�


	
	
}

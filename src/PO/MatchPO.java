package PO;
import java.io.Serializable;
import java.util.ArrayList;


public class MatchPO implements Serializable{
	
	/**
	 * ÿ������������
	 */
	public static final long serialVersionUID = 1L;
	public String season;                                 //����
	public String date;                                   //����
	public String homeTeam;                               //��������
	public String guestTeam;                              //�ͳ�����
	public String score;                                  //�ȷ�
	public String score1;                                 //��һ�ڱȷ�
	public String score2;                                 //�ڶ��ڱȷ�
	public String score3;                                 //�����ڱȷ�
	public String score4;                                 //���Ľڱȷ�
	public String scoreExtra;                             //��ʱ���ȷ�
	public ArrayList<PlayerTechMPO> playerStatistic;      //��Ա����ͳ��
	public boolean ifHomeTeamWin;                         //�����Ƿ�ʤ��
	
	
	

}

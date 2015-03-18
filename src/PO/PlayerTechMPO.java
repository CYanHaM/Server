package PO;
import java.io.Serializable;

public class PlayerTechMPO implements Serializable{
	
	/**
	 *每场比赛球员技术统计 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name;                         //姓名
	public String team;                         //队伍
	public String position;                     //位置
	public double time;                         //在场时间
	public double shotIn;                       //投篮命中数
	public double shot;                         //投篮出手数
	public double threeShotIn;                  //三分命中数
	public double threeShot;                    //三分出手数
	public double penaltyShotIn;                //罚球命中数
	public double penaltyShot;                  //发球出手数
	public double offensiveRebound;             //前场篮板数
	public double defensiveRebound;             //后场篮板数
	public double rebound;                      //总篮板数
	public double secondaryAttack;              //助攻数
	public double steal;                        //抢断数
	public double blockShot;                    //盖帽数
	public double fault;                        //失误数
	public double foul;                         //犯规数
	public double score;                        //个人得分
	
	
	

}

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
	public int time;                         //在场时间
	public int shotIn;                       //投篮命中数
	public int shot;                         //投篮出手数
	public int threeShotIn;                  //三分命中数
	public int threeShot;                    //三分出手数
	public int penaltyShotIn;                //罚球命中数
	public int penaltyShot;                  //发球出手数
	public int offensiveRebound;             //前场篮板数
	public int defensiveRebound;             //后场篮板数
	public int rebound;                      //总篮板数
	public int secondaryAttack;              //助攻数
	public int steal;                        //抢断数
	public int blockShot;                    //盖帽数
	public int fault;                        //失误数
	public int foul;                         //犯规数
	public int score;                        //个人得分
	
	
	

}

package PO;
import java.io.Serializable;


public class PlayerTechPO implements Serializable{
	/**
	 * 赛季球员总数据
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //球员名称
	public String season;                          //赛季
	public String team;                            //所属球队
	public int gameNum;                         //参赛场数
	public int startingNum;                     //先发场数
	public int rebound;                         //篮板数
	public int secondaryAttack;                 //助攻数
	public int time;                            //在场时间
	public double shotInRate;                      //投篮命中率
	public double threeShotInRate;                 //三分命中率
	public double penaltyShotInRate;               //罚球命中率
	public int offensiveNum;                    //进攻数
	public int defensiveNum;                    //防守数
	public int steal;                           //抢断数
	public int blockShot;                       //盖帽数
	public int fault;                           //失误数
	public int foul;                            //犯规数
	public int score;                           //得分
	public double efficiency;                        //效率
	public double GmScEfficiency;                    //GmSc效率值
	public double trueShotInRate;                  //真实命中率
	public double shootingEfficiency;                //投篮效率
	public double reboundRate;                     //篮板率
	public double offensiveReboundRate;            //进攻篮板率
	public double defensiveReboundRate;            //防守篮板率
	public double secondaryAttackRate;             //助攻率
	public double stealRate;                       //抢断率
	public double blockShotRate;                   //盖帽率
	public double faultRate;                       //失误率	
	public double usageRate;                       //使用率
	

}
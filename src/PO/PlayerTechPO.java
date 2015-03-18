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
	public double gameNum;                         //参赛场数
	public double startingNum;                     //先发场数
	public double rebound;                         //篮板数
	public double secondaryAttack;                 //助攻数
	public double time;                            //在场时间
	public double shotInRate;                      //投篮命中率
	public double threeShotInRate;                 //三分命中率
	public double penaltyShotInRate;               //罚球命中率
	public double offensiveNum;                    //进攻数
	public double defensiveNum;                    //防守数
	public double steal;                           //抢断数
	public double blockShot;                       //盖帽数
	public double fault;                           //失误数
	public double foul;                            //犯规数
	public double score;                           //得分
	public double effiency;                        //效率
	public double GmScEffiency;                    //GmSc效率值
	public double trueShotInRate;                  //真实命中率
	public double shootingEffiency;                //投篮效率
	public double reboundRate;                     //篮板率
	public double offensiveReboundRate;            //进攻篮板率
	public double defensiveReboundRate;            //防守篮板率
	public double secondaryAttackRate;             //助攻数
	public double stealRate;                       //抢断数
	public double blockShotRate;                   //盖帽数
	public double faultRate;                       //失误数	
	public double usageRate;                       //使用率
	

}

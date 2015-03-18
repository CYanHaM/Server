package PO;
import java.io.Serializable;


public class TeamTechPO implements Serializable {
	
	/**
	 * 赛季球队总数据
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //球队名称
	public String season;                          //赛季
	public double gameNum;                         //比赛场数
	public double shotInNum;                       //投篮命中数
	public double shotNum;                         //投篮出手数
	public double threeShotInNum;                  //三分命中数
	public double threeShotNum;                    //三分出手数
	public double penaltyShotInNum;                //罚球命中数
	public double penaltyShotNum;                  //发球出手数
	public double offensiveRebound;                //前场篮板数
	public double defensiveRebound;                //后场篮板数
	public double rebound;                         //总篮板数
	public double secondaryAttack;                 //助攻数
	public double steal;                           //抢断数
	public double blockShot;                       //盖帽数
	public double fault;                           //失误数
	public double foul;                            //犯规数
	public double score;                           //比赛得分
	public double shotInRate;                      //投篮命中率
	public double threeShotInRate;                 //三分命中率
	public double penaltyShotInRate;               //罚球命中率
	public double winningRate;                     //胜率
	public double offensiveRound;                  //进攻回合
	public double offensiveEffiency;               //进攻效率
	public double defensiveEffiency;               //防守效率
	public double reboundEffiency;                 //篮板效率
	public double stealEffiency;                   //抢断效率
	public double secondaryAttackEffiency;         //助攻效率
	
	
}

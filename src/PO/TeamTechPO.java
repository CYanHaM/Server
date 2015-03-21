package PO;
import java.io.Serializable;


public class TeamTechPO implements Serializable {
	
	/**
	 * 赛季球队总数据
	 */
	public static final long serialVersionUID = 1L;
	public String name;                            //球队名称
	public String season;                          //赛季
	public int gameNum;                         //比赛场数
	public int shotInNum;                       //投篮命中数
	public int shotNum;                         //投篮出手数
	public int threeShotInNum;                  //三分命中数
	public int threeShotNum;                    //三分出手数
	public int penaltyShotInNum;                //罚球命中数
	public int penaltyShotNum;                  //罚球出手数
	public int offensiveRebound;                //前场篮板数
	public int defensiveRebound;                //后场篮板数
	public int rebound;                         //总篮板数
	public int secondaryAttack;                 //助攻数
	public int steal;                           //抢断数
	public int blockShot;                       //盖帽数
	public int fault;                           //失误数
	public int foul;                            //犯规数
	public int score;                           //比赛得分
	public double shotInRate;                      //投篮命中率
	public double threeShotInRate;                 //三分命中率
	public double penaltyShotInRate;               //罚球命中率
	public double winningRate;                     //胜率
	public int winningNum;                         //胜场数
	public double offensiveRound;                  //进攻回合
	public double offensiveEfficiency;               //进攻效率
	public double defensiveEfficiency;               //防守效率
	public double reboundEfficiency;                 //篮板效率
	public double stealEfficiency;                   //抢断效率
	public double secondaryAttackEfficiency;         //助攻效率
	public int opponentDefensiveRebound;          //对方防守篮板
	public int opponentOffensiveRebound;          //对方进攻篮板
	public double opponentOffensiveRound;        //对方进攻回合
	public int opponentScore;        //对方得分


	
	
}

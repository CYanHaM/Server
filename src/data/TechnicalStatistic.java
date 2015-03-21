package data;

import java.util.ArrayList;
import PO.PlayerTechPO;
import PO.TeamTechPO;

public class TechnicalStatistic {
	public ArrayList<TeamTechPO> teamTechGenerating(ArrayList<TeamTechPO> ttplist){
		ArrayList<TeamTechPO> result=new ArrayList<TeamTechPO>();
		
		for(TeamTechPO ttp:ttplist){
			TeamTechPO newttp=new TeamTechPO();
			newttp.name=ttp.name;
			newttp.season=ttp.season;
			newttp.gameNum=ttp.gameNum;
			newttp.shotInNum=ttp.shotInNum;
			newttp.shotNum=ttp.shotNum;
			newttp.threeShotInNum=ttp.threeShotInNum;
			newttp.threeShotNum=ttp.threeShotNum;
			newttp.penaltyShotInNum=ttp.penaltyShotInNum;
			newttp.penaltyShotNum=ttp.penaltyShotNum;
			newttp.offensiveRebound=ttp.offensiveRebound;
			newttp.defensiveRebound=ttp.defensiveRebound;
			newttp.rebound=ttp.rebound;
			newttp.secondaryAttack=ttp.secondaryAttack;
			newttp.steal=ttp.steal;
			newttp.blockShot=ttp.blockShot;
			newttp.foul=ttp.foul;
			newttp.fault=ttp.fault;
			newttp.score=ttp.score;
			newttp.winningNum=ttp.winningNum;
			newttp.opponentDefensiveRebound=ttp.opponentDefensiveRebound;
			newttp.shotInRate=(double)newttp.shotInNum/(double)newttp.shotNum;
			newttp.threeShotInRate=(double)newttp.threeShotInNum/(double)newttp.threeShotNum;
			newttp.penaltyShotInRate=(double)newttp.penaltyShotInNum/(double)newttp.penaltyShotNum;
			newttp.winningRate=(double)newttp.winningNum/82;
			newttp.offensiveRound=ttp.offensiveRound;
			newttp.opponentDefensiveRebound=ttp.opponentDefensiveRebound;
			newttp.opponentOffensiveRebound=ttp.opponentOffensiveRebound;
			newttp.opponentOffensiveRound=ttp.opponentOffensiveRound;
			newttp.opponentScore=ttp.opponentScore;
			newttp.offensiveEfficiency=(double)newttp.score/(double)newttp.offensiveRound*100;
			newttp.defensiveEfficiency=(double)newttp.opponentScore/(double)newttp.opponentOffensiveRound*100;
			newttp.reboundEfficiency=(double)newttp.rebound/((double)newttp.rebound+(double)newttp.opponentDefensiveRebound+(double)newttp.opponentOffensiveRebound);
			newttp.stealEfficiency=(double)newttp.steal/(double)newttp.opponentOffensiveRound*100;
			newttp.secondaryAttackEfficiency=(double)newttp.secondaryAttack/(double)newttp.offensiveRound*100;
			result.add(newttp);
 		}
		
		
		return result;
	
		
	}
	
	
	public ArrayList<PlayerTechPO> playerTechGenerating(ArrayList<PlayerTechPO> ptplist){
		ArrayList<PlayerTechPO>result=new ArrayList<PlayerTechPO>();
		
		for(PlayerTechPO ptp:ptplist){
			PlayerTechPO newptp=new PlayerTechPO();
			newptp.name=ptp.name;
			newptp.season=ptp.season;
			newptp.team=ptp.team;
			newptp.gameNum=ptp.gameNum;
			newptp.startingNum=ptp.startingNum;
			newptp.rebound=ptp.rebound;
			newptp.secondaryAttack=ptp.secondaryAttack;
			newptp.time=ptp.time;
			newptp.shotInRate=(double)ptp.shotIn/(double)ptp.shot;
			newptp.threeShotInRate=(double)ptp.threeShotIn/(double)ptp.threeShot;
			newptp.penaltyShotInRate=(double)ptp.penaltyShotIn/(double)ptp.penaltyShot;
			newptp.offensiveNum=ptp.offensiveNum;
			newptp.defensiveNum=ptp.defensiveNum;
			newptp.steal=ptp.steal;
			newptp.blockShot=ptp.blockShot;
			newptp.foul=ptp.foul;
			newptp.fault=ptp.fault;
			newptp.score=ptp.score;
			newptp.shot=ptp.shot;
			newptp.shotIn=ptp.shotIn;
			newptp.threeShot=ptp.threeShot;
			newptp.threeShotIn=ptp.threeShotIn;
			newptp.penaltyShot=ptp.penaltyShot;
			newptp.penaltyShotIn=ptp.penaltyShotIn;
			newptp.efficiency=(ptp.score+ptp.rebound+ptp.secondaryAttack+ptp.steal+ptp.blockShot)-(ptp.shot-ptp.shotIn)-(ptp.penaltyShot-ptp.penaltyShotIn)-ptp.foul;
			newptp.GmScEfficiency=(double)ptp.score+0.4*(double)ptp.shotIn-0.7*(double)ptp.shot-0.4*((double)ptp.penaltyShot-(double)ptp.penaltyShotIn)+0.7*(double)ptp.offensiveNum+0.3*(double)ptp.defensiveNum+(double)ptp.steal+0.7*(double)ptp.secondaryAttack+0.7*(double)ptp.blockShot-0.4*(double)ptp.fault-(double)ptp.foul;
			newptp.trueShotInRate=(double)ptp.score/(2*((double)ptp.shot+0.44*(double)ptp.penaltyShot));
			newptp.shootingEfficiency=((double)ptp.shotIn+0.5*(double)ptp.threeShotIn)/(double)ptp.shot;
			newptp.teamAllTime=ptp.teamAllTime;
			newptp.teamDefensiveRebound=ptp.teamDefensiveRebound;
			newptp.teamOffensiveRebound=ptp.teamOffensiveRebound;
			newptp.opponentDefensiveRebound=ptp.opponentDefensiveRebound;
			newptp.opponentOffensiveRebound=ptp.opponentOffensiveRebound;
			newptp.reboundRate=(double)ptp.rebound*((double)ptp.teamAllTime/5)/(double)ptp.time/((double)ptp.teamDefensiveRebound+(double)ptp.teamOffensiveRebound+(double)ptp.opponentDefensiveRebound+(double)ptp.opponentOffensiveRebound);
			newptp.offensiveReboundRate=(double)ptp.offensiveNum*((double)ptp.teamAllTime/5)/(double)ptp.time/((double)ptp.teamOffensiveRebound+(double)ptp.opponentOffensiveRebound);
			newptp.defensiveReboundRate=(double)ptp.defensiveNum*((double)ptp.teamAllTime/5)/(double)ptp.time/((double)ptp.teamDefensiveRebound+(double)ptp.opponentDefensiveRebound);
			newptp.secondaryAttackRate=(double)ptp.secondaryAttack/((double)ptp.time/((double)ptp.teamAllTime/5)*(double)ptp.teamShotIn-(double)ptp.shotIn);
			newptp.stealRate=(double)ptp.steal*((double)ptp.teamAllTime/5)/(double)ptp.time/(double)ptp.opponentOffensiveNum;
			newptp.blockShotRate=(double)ptp.blockShot*((double)ptp.teamAllTime/5)/(double)ptp.time/(double)ptp.opponentTwoShot;
			newptp.foulRate=(double)ptp.foul/((double)ptp.shot-(double)ptp.threeShot+0.44*(double)ptp.penaltyShot+(double)ptp.foul);
			newptp.usageRate=((double)ptp.shot+0.44*(double)ptp.penaltyShot+(double)ptp.foul)*((double)ptp.teamAllTime/5)/(double)ptp.time/((double)ptp.teamShot+0.44*(double)ptp.teamPenaltyShot+(double)ptp.teamFoul);
			
			result.add(newptp);
					
		}
		return result;
	}

}

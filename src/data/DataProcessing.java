package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import PO.MatchPO;
import PO.PlayerPO;
import PO.PlayerTechMPO;
import PO.TeamPO;

/*
 * 原始信息的处理（包括比赛信息，球员基本信息和球队基本信息）
 * @cao
 * 2015-3-20 01:34:53
 *修改次数5
 */
public class DataProcessing implements DataToSQL{
	
	ArrayList<MatchPO>mlist=new ArrayList<MatchPO>();
	ArrayList<PlayerPO>plist=new ArrayList<PlayerPO>();
	ArrayList<TeamPO>tlist=new ArrayList<TeamPO>();
	//比赛信息读入
	public ArrayList<MatchPO> matchRead(){
		try {
			String encoding = "GBK";
			File file = new File("matchData");
			File filelist[]=file.listFiles();
			for(int i=0;i<filelist.length;i++){
				
				MatchPO matchpo=new MatchPO();
				ArrayList<String>info=new ArrayList<String>();
				
				InputStreamReader read = new InputStreamReader(new FileInputStream(filelist[i].getAbsolutePath()),encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String line = null;
				while((line = bufferedReader.readLine())!=null) {
					info.add(line);
					
				}
				read.close();
				
				String[][]data=new String [info.size()][];
				for(int j=0;j<info.size();j++){
					data[j]=info.get(j).split(";");
				}
				matchpo.date=data[0][0];
				matchpo.guestTeam=data[0][1].split("-")[0];
				matchpo.homeTeam=data[0][1].split("-")[1];
				matchpo.score=data[0][2];
				matchpo.guestScore=Integer.parseInt(data[0][2].split("-")[0]);
				matchpo.homeScore=Integer.parseInt(data[0][2].split("-")[1]);
				matchpo.score1=data[1][0];
				matchpo.score2=data[1][1];
				matchpo.score3=data[1][2];
				matchpo.score4=data[1][3];
				if(data[1].length>4){
					matchpo.scoreExtra=data[1][data[1].length-1];
				}else{
					matchpo.scoreExtra=null;
				}
				matchpo.season=filelist[i].getName().split("-")[0];
				
				//录入胜负情况
				int guestTeamScore=Integer.parseInt(matchpo.score.split("-")[0]);
				int homeTeamScore=Integer.parseInt(matchpo.score.split("-")[1]);
				if(homeTeamScore>guestTeamScore){
					matchpo.ifHomeTeamWin=1;
					matchpo.ifGuestTeamWin=0;
				}
				else if(homeTeamScore<guestTeamScore){
					matchpo.ifHomeTeamWin=0;
					matchpo.ifGuestTeamWin=1;
				}else if(homeTeamScore==guestTeamScore){
					matchpo.ifHomeTeamWin=0;
					matchpo.ifGuestTeamWin=0;
				}
				
				//录入球员技术信息（标记第二个队的行数）
				int homeTeamTip=0;
				for(int j=0;j<info.size();j++){
					if(data[j].length==1&&j!=2){
						homeTeamTip=j;
						break;
					}
					
				}
				ArrayList<PlayerTechMPO>ptmlist =new ArrayList<PlayerTechMPO>();
				matchpo.playerStatistic=ptmlist;
				for(int k=3;k<homeTeamTip;k++){
					
					PlayerTechMPO ptmp=new PlayerTechMPO();
					ptmp.name=data[k][0];
					ptmp.position=data[k][1];
					try{
						ptmp.time=Integer.parseInt(data[k][2].split(":")[0]);
					}catch (NumberFormatException e){
						ptmp.time=0;
					}
					System.out.println(ptmp.time);
					ptmp.shotIn=Integer.parseInt(data[k][3]);
					ptmp.shot=Integer.parseInt(data[k][4]);
					ptmp.threeShotIn=Integer.parseInt(data[k][5]);
					ptmp.threeShot=Integer.parseInt(data[k][6]);
					ptmp.penaltyShotIn=Integer.parseInt(data[k][7]);
					ptmp.penaltyShot=Integer.parseInt(data[k][8]);
					ptmp.offensiveRebound=Integer.parseInt(data[k][9]);
					ptmp.defensiveRebound=Integer.parseInt(data[k][10]);
					ptmp.rebound=Integer.parseInt(data[k][11]);
					ptmp.secondaryAttack=Integer.parseInt(data[k][12]);
					ptmp.steal=Integer.parseInt(data[k][13]);
					ptmp.blockShot=Integer.parseInt(data[k][14]);
					ptmp.fault=Integer.parseInt(data[k][15]);
					ptmp.foul=Integer.parseInt(data[k][16]);
					try{
						ptmp.score=Integer.parseInt(data[k][17]);
					}catch(NumberFormatException e){
						ptmp.score=0;
						
					}
					ptmp.team=data[2][0];
					
					if(k>=3&&k<=7)
						ptmp.ifFirstLineUp=1;
					else
						ptmp.ifFirstLineUp=0;
					
					if(ptmp.time>0)
						ptmp.ifParticipate=1;
					else
						ptmp.ifParticipate=0;
					matchpo.playerStatistic.add(ptmp);
					
				}
				
				for(int k=homeTeamTip+1;k<info.size();k++){
					
					PlayerTechMPO ptmp=new PlayerTechMPO();
					ptmp.name=data[k][0];
					ptmp.position=data[k][1];
					try{
						ptmp.time=Integer.parseInt(data[k][2].split(":")[0]);
					}catch (NumberFormatException e){
						ptmp.time=0;
					}					
					ptmp.shotIn=Integer.parseInt(data[k][3]);
					ptmp.shot=Integer.parseInt(data[k][4]);
					ptmp.threeShotIn=Integer.parseInt(data[k][5]);
					ptmp.threeShot=Integer.parseInt(data[k][6]);
					ptmp.penaltyShotIn=Integer.parseInt(data[k][7]);
					ptmp.penaltyShot=Integer.parseInt(data[k][8]);
					ptmp.offensiveRebound=Integer.parseInt(data[k][9]);
					ptmp.defensiveRebound=Integer.parseInt(data[k][10]);
					ptmp.rebound=Integer.parseInt(data[k][11]);
					ptmp.secondaryAttack=Integer.parseInt(data[k][12]);
					ptmp.steal=Integer.parseInt(data[k][13]);
					ptmp.blockShot=Integer.parseInt(data[k][14]);
					ptmp.fault=Integer.parseInt(data[k][15]);
					ptmp.foul=Integer.parseInt(data[k][16]);
					try{
						ptmp.score=Integer.parseInt(data[k][17]);
					}catch(NumberFormatException e){
						ptmp.score=0;
						
					}
					ptmp.team=data[2][0];
					
					if(k>=homeTeamTip+1&&k<=homeTeamTip+5)
						ptmp.ifFirstLineUp=1;
					else
						ptmp.ifFirstLineUp=0;
					
					if(ptmp.time>0)
						ptmp.ifParticipate=1;
					else
						ptmp.ifParticipate=0;
					matchpo.playerStatistic.add(ptmp);
				}
				//计算主客队进攻防守篮板数
				int homeDeRebound=0;
				int guestDeRebound=0;
				int homeOfRebound=0;
				int guestOfRebound=0;
				int homeShot=0;
				int guestShot=0;
				int homeShotin=0;
				int guestShotin=0;
				int homethreeshot=0;
				int guestthreeshot=0;
				int homePShot=0;
				int guestPShot=0;
				int homeFault=0;
				int guestFault=0;
				int homeTime=0;
				int guestTime=0;
				
				for(int j=0;j<homeTeamTip-3;j++){
					guestDeRebound=guestDeRebound+matchpo.playerStatistic.get(j).defensiveRebound;
					guestOfRebound=guestOfRebound+matchpo.playerStatistic.get(j).offensiveRebound;
					guestShot=guestShot+matchpo.playerStatistic.get(j).shot;
					guestShotin=guestShotin+matchpo.playerStatistic.get(j).shotIn;
					guestthreeshot=guestthreeshot+matchpo.playerStatistic.get(j).threeShot;
					guestPShot=guestPShot+matchpo.playerStatistic.get(j).penaltyShot;
					guestFault=guestFault+matchpo.playerStatistic.get(j).fault;
					guestTime=guestTime+matchpo.playerStatistic.get(j).time;
					
				}
				
				for(int j=homeTeamTip-3;j<info.size()-4;j++){
					homeDeRebound=homeDeRebound+matchpo.playerStatistic.get(j).defensiveRebound;
					homeOfRebound=homeOfRebound+matchpo.playerStatistic.get(j).offensiveRebound;
					homeShot=homeShot+matchpo.playerStatistic.get(j).shot;
					homeShotin=homeShotin+matchpo.playerStatistic.get(j).shotIn;
					homethreeshot=homethreeshot+matchpo.playerStatistic.get(j).threeShot;
					homePShot=homePShot+matchpo.playerStatistic.get(j).penaltyShot;
					homeFault=homeFault+matchpo.playerStatistic.get(j).fault;
					homeTime=homeTime+matchpo.playerStatistic.get(j).time;
					
				}
				matchpo.homeShotIn=homeShotin;
				matchpo.guestShotIn=guestShotin;
				matchpo.homeTwoShot=homeShot-homethreeshot;
				matchpo.guestTwoShot=guestShot-guestthreeshot;
				matchpo.homePenaltyShot=homePShot;
				matchpo.guestPenaltyShot=guestPShot;
				matchpo.homeFoul=homeFault;
				matchpo.guestFoul=guestFault;
				matchpo.guestTeamDeffensiveRebound=guestDeRebound;
				matchpo.homeTeamDeffensiveRebound=homeDeRebound;
				matchpo.guestTeamOffensiveRebound=guestOfRebound;
				matchpo.homeTeamOffensiveRebound=homeOfRebound;
				matchpo.homeAllTime=homeTime;
				matchpo.guestAllTime=guestTime;
				//计算主客队进攻回合
				matchpo.homeTeamOffensiveRound=(double)homeShot+0.4*(double)homePShot-1.07*((double)homeOfRebound/((double)homeOfRebound+(double)guestDeRebound)*((double)homeShot-(double)homeShotin))+1.07*(double)homeFault;
				matchpo.guestTeamOffensiveRound=(double)guestShot+0.4*(double)guestPShot-1.07*((double)guestOfRebound/((double)guestOfRebound+(double)homeDeRebound)*((double)guestShot-(double)guestShotin))+1.07*(double)guestFault;
				
				
				mlist.add(matchpo);
				
			}
		}catch(Exception e) {
			System.out.println("操作出错");
			e.printStackTrace();
		}
		return mlist;
		
	}
	
	//球员基本信息输入
	public ArrayList<PlayerPO> playerRead(){
		try {
			String encoding = "GBK";
			File file = new File("playerData");
			File filelist[]=file.listFiles();
			for(int i=0;i<filelist.length;i++){
				
				PlayerPO playerpo=new PlayerPO();
				ArrayList<String>info=new ArrayList<String>();
				
				InputStreamReader read = new InputStreamReader(new FileInputStream(filelist[i].getAbsolutePath()),encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String line = null;
				while((line = bufferedReader.readLine())!=null) {
					info.add(line);
					System.out.println(line);
				}
				read.close();
				
				String[][]data=new String [9][];
				for(int j=1;j<info.size()-1;j=j+2){
					data[(j-1)/2]=info.get(j).split("║");
					System.out.println(data[j][0]);
				}
				
				playerpo.name=data[0][1].split("│")[1];
				playerpo.uniformNum=Integer.parseInt(data[1][1].split("│")[1]);
				playerpo.position=data[2][1].split("│")[1];
				playerpo.height=data[3][1].split("│")[1];
				playerpo.weight=Double.valueOf(data[4][1].split("│")[1]);
				playerpo.birth=data[5][1].split("│")[1];
				playerpo.age=Integer.parseInt(data[6][1].split("│")[1]);
				playerpo.exp=Integer.parseInt(data[7][1].split("│")[1]);
				playerpo.school=data[8][1].split("│")[1];
				plist.add(playerpo);
				
			}
		}catch(Exception e) {
			System.out.println("操作出错");
			e.printStackTrace();
		}
		return plist;
		
	}
	
	//球队基本信息输入
	public ArrayList<TeamPO> teamRead(){
		try {
			String encoding = "GBK";
			File file = new File("/teamData/teams");
			ArrayList<String>info=new ArrayList<String>();					
			InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
			BufferedReader bufferedReader = new BufferedReader(read);
			String line = null;
			while((line = bufferedReader.readLine())!=null) {
				info.add(line);
				
			}
			read.close();
			
			for(int j=1;j<info.size()-1;j++){
				TeamPO teampo=new TeamPO();
				String data[]=info.get(j).split("║")[1].split("│");
				teampo.fullName=data[0];
				teampo.abbreviation=data[1];
				teampo.location=data[2];
				teampo.division=data[3];
				teampo.partition=data[4];
				teampo.homeCourt=data[5];
				teampo.time=data[6];
				tlist.add(teampo);
			}
			
		}catch(Exception e) {
			System.out.println("操作出错");
			e.printStackTrace();
		}
		return tlist;
		
	}
	
	public static void main(String args[]){
		DataProcessing d=new DataProcessing();
		ArrayList<MatchPO> nn=new ArrayList<MatchPO>();
		ArrayList<PlayerPO> pn=new ArrayList<PlayerPO>();

	//	nn=d.matchRead();
		pn=d.playerRead();
		for (int i = 0; i < nn.size(); i++) {
	//		System.out.println(nn.get(i).date);
			System.out.println(pn.get(i).school);

			
		}
	}
}


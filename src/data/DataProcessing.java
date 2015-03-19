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
 * 2015年3月19日16:38:17
 *
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
			String filelist[]=file.list();
			for(int i=0;i<filelist.length;i++){
				
				MatchPO matchpo=new MatchPO();
				ArrayList<String>info=new ArrayList<String>();
				
				InputStreamReader read = new InputStreamReader(new FileInputStream(filelist[i]),encoding);
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
				matchpo.score1=data[1][0];
				matchpo.score2=data[1][1];
				matchpo.score3=data[1][2];
				matchpo.score4=data[1][3];
				if(data[1].length>4){
					matchpo.scoreExtra=data[1][5];
				}else{
					matchpo.scoreExtra=null;
				}
				matchpo.season=filelist[i].split("-")[0];
				
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
				for(int k=3;k<homeTeamTip;k++){
					
					PlayerTechMPO ptmp=new PlayerTechMPO();
					ptmp.name=data[k][0];
					ptmp.position=data[k][1];
					ptmp.time=Integer.parseInt(data[k][2].split(":")[0])*60+Integer.parseInt(data[k][2].split(":")[1]);
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
					ptmp.foul=Integer.parseInt(data[k][15]);
					ptmp.fault=Integer.parseInt(data[k][16]);
					ptmp.score=Integer.parseInt(data[k][17]);
					ptmp.team=data[2][0];
					if(k>=3&&k<=7)
						ptmp.ifFirstLineUp=1;
					else
						ptmp.ifFirstLineUp=0;
					matchpo.playerStatistic.add(ptmp);
										
				}
				
				for(int k=homeTeamTip+1;k<info.size();k++){
					
					PlayerTechMPO ptmp=new PlayerTechMPO();
					ptmp.name=data[k][0];
					ptmp.position=data[k][1];
					ptmp.time=Integer.parseInt(data[k][2].split(":")[0])*60+Integer.parseInt(data[k][2].split(":")[1]);
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
					ptmp.foul=Integer.parseInt(data[k][15]);
					ptmp.fault=Integer.parseInt(data[k][16]);
					ptmp.score=Integer.parseInt(data[k][17]);
					ptmp.team=data[2][0];
					if(k>=homeTeamTip+1&&k<=homeTeamTip+5)
						ptmp.ifFirstLineUp=1;
					else
						ptmp.ifFirstLineUp=0;
					matchpo.playerStatistic.add(ptmp);
					
				}
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
			String filelist[]=file.list();
			for(int i=0;i<filelist.length;i++){
				
				PlayerPO playerpo=new PlayerPO();
				ArrayList<String>info=new ArrayList<String>();
				
				InputStreamReader read = new InputStreamReader(new FileInputStream(filelist[i]),encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String line = null;
				while((line = bufferedReader.readLine())!=null) {
					info.add(line);
					
				}
				read.close();
				
				String[][]data=new String [info.size()][];
				for(int j=0;j<info.size();j++){
					data[j]=info.get(j).split("║");
				}
				playerpo.name=data[1][1].split("│")[1];
				playerpo.uniformNum=Integer.parseInt(data[3][1].split("│")[1]);
				playerpo.position=data[5][1].split("│")[1];
				playerpo.height=data[7][1].split("│")[1];
				playerpo.weight=Double.valueOf(data[9][1].split("│")[1]);
				playerpo.birth=data[11][1].split("│")[1];
				playerpo.age=Integer.parseInt(data[13][1].split("│")[1]);
				playerpo.exp=Integer.parseInt(data[15][1].split("│")[1]);
				playerpo.school=data[17][1].split("│")[1];
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
			File file = new File("teamData");
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
	
}

	

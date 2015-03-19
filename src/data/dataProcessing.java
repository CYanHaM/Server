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
 * ԭʼ��Ϣ�Ĵ�������������Ϣ����Ա������Ϣ����ӻ�����Ϣ��
 * @cao
 * 2015��3��19��16:38:17
 *
 */
public class dataProcessing {
	
	ArrayList<MatchPO>mlist=new ArrayList<MatchPO>();
	ArrayList<PlayerPO>plist=new ArrayList<PlayerPO>();
	ArrayList<TeamPO>tlist=new ArrayList<TeamPO>();
	//������Ϣ����
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
				
				//¼��ʤ�����
				int guestTeamScore=Integer.parseInt(matchpo.score.split("-")[0]);
				int homeTeamScore=Integer.parseInt(matchpo.score.split("-")[1]);
				if(homeTeamScore>guestTeamScore)
					matchpo.ifHomeTeamWin=true;
				else
					matchpo.ifHomeTeamWin=false;
				
				//¼����Ա������Ϣ����ǵڶ����ӵ�������
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
					ptmp.time=Double.valueOf(data[k][2]);
					ptmp.shotIn=Double.valueOf(data[k][3]);
					ptmp.shot=Double.valueOf(data[k][4]);
					ptmp.threeShotIn=Double.valueOf(data[k][5]);
					ptmp.threeShot=Double.valueOf(data[k][6]);
					ptmp.penaltyShotIn=Double.valueOf(data[k][7]);
					ptmp.penaltyShot=Double.valueOf(data[k][8]);
					ptmp.offensiveRebound=Double.valueOf(data[k][9]);
					ptmp.defensiveRebound=Double.valueOf(data[k][10]);
					ptmp.rebound=Double.valueOf(data[k][11]);
					ptmp.secondaryAttack=Double.valueOf(data[k][12]);
					ptmp.steal=Double.valueOf(data[k][13]);
					ptmp.blockShot=Double.valueOf(data[k][14]);
					ptmp.foul=Double.valueOf(data[k][15]);
					ptmp.fault=Double.valueOf(data[k][16]);
					ptmp.score=Double.valueOf(data[k][17]);
					ptmp.team=data[2][0];
					matchpo.playerStatistic.add(ptmp);
										
				}
				
				for(int k=homeTeamTip+1;k<info.size();k++){
					
					PlayerTechMPO ptmp=new PlayerTechMPO();
					ptmp.name=data[k][0];
					ptmp.position=data[k][1];
					ptmp.time=Double.valueOf(data[k][2]);
					ptmp.shotIn=Double.valueOf(data[k][3]);
					ptmp.shot=Double.valueOf(data[k][4]);
					ptmp.threeShotIn=Double.valueOf(data[k][5]);
					ptmp.threeShot=Double.valueOf(data[k][6]);
					ptmp.penaltyShotIn=Double.valueOf(data[k][7]);
					ptmp.penaltyShot=Double.valueOf(data[k][8]);
					ptmp.offensiveRebound=Double.valueOf(data[k][9]);
					ptmp.defensiveRebound=Double.valueOf(data[k][10]);
					ptmp.rebound=Double.valueOf(data[k][11]);
					ptmp.secondaryAttack=Double.valueOf(data[k][12]);
					ptmp.steal=Double.valueOf(data[k][13]);
					ptmp.blockShot=Double.valueOf(data[k][14]);
					ptmp.foul=Double.valueOf(data[k][15]);
					ptmp.fault=Double.valueOf(data[k][16]);
					ptmp.score=Double.valueOf(data[k][17]);
					ptmp.team=data[homeTeamTip][0];
					matchpo.playerStatistic.add(ptmp);
					
				}
				mlist.add(matchpo);
				
			}
		}catch(Exception e) {
			System.out.println("��������");
			e.printStackTrace();
		}
		return mlist;
		
	}
	
	//��Ա������Ϣ����
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
					data[j]=info.get(j).split("�U");
				}
				playerpo.name=data[1][1].split("��")[1];
				playerpo.uniformNum=Integer.parseInt(data[3][1].split("��")[1]);
				playerpo.position=data[5][1].split("��")[1];
				playerpo.height=data[7][1].split("��")[1];
				playerpo.weight=Double.valueOf(data[9][1].split("��")[1]);
				playerpo.birth=data[11][1].split("��")[1];
				playerpo.age=Integer.parseInt(data[13][1].split("��")[1]);
				playerpo.exp=Integer.parseInt(data[15][1].split("��")[1]);
				playerpo.school=data[17][1].split("��")[1];
				plist.add(playerpo);
				
			}
		}catch(Exception e) {
			System.out.println("��������");
			e.printStackTrace();
		}
		return plist;
		
	}
	
	//��ӻ�����Ϣ����
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
				String data[]=info.get(j).split("�U")[1].split("��");
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
			System.out.println("��������");
			e.printStackTrace();
		}
		return tlist;
		
	}
	
}

	

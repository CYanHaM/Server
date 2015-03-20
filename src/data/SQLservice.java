package data;

import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

/*
 * 供返回Tech的半成品使用
 */
public interface SQLservice {
	
	public ArrayList<PlayerTechPO> getPlayerTech();
	public ArrayList<TeamTechPO> getTeamTech();

}

package data;

import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

/*
 * ������Tech�İ��Ʒʹ��
 */
public interface SQLservice {
	
	public ArrayList<PlayerTechPO> getPlayerTech();
	public ArrayList<TeamTechPO> getTeamTech();

}

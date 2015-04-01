package data;

import java.util.ArrayList;

import PO.PlayerTechPO;
import PO.TeamTechPO;

public interface UpdateService {

	public void updatePlayerTech(ArrayList<PlayerTechPO> list);
	
	public void updateTeamTech(ArrayList<TeamTechPO> list);
	
}

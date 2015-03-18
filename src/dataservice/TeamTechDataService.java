package dataservice;

import java.util.ArrayList;

import PO.TeamTechPO;
import TypeEnum.TeamTechEnum;

public interface TeamTechDataService {
	public ArrayList<TeamTechPO> ascend(TeamTechEnum type);
	// 按照type 所示条件升序排序
	
	public ArrayList<TeamTechPO> descend(TeamTechEnum type);
	//按照type所示条件降序排序
}

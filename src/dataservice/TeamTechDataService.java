package dataservice;

import java.util.ArrayList;

import PO.TeamTechPO;
import TypeEnum.TeamTechEnum;

public interface TeamTechDataService {
	public ArrayList<TeamTechPO> ascend(TeamTechEnum type);
	// ����type ��ʾ������������
	
	public ArrayList<TeamTechPO> descend(TeamTechEnum type);
	//����type��ʾ������������
}

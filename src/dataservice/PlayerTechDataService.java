package dataservice;

import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;

public interface PlayerTechDataService {
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum type);
	//按照type所示条件升序排序
	
	public ArrayList<PlayerTechPO> descend(PlayerTechEnum type);
	//按照type所示条件降序排序
	
	public ArrayList<PlayerTechPO> sift(PlayerTechPO ptpo);
	/* 根据条件筛选并排序
	 * 可用作筛选条件的有：
	 * 可用作排序条件的有：
	 * 筛选条件作为特定属性存入ptpo
	 * 排序条件则为该项属性非0
	 * */
}

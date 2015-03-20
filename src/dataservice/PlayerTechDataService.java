package dataservice;

import java.util.ArrayList;

import PO.PlayerPO;
import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;

public interface PlayerTechDataService {
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum type);
	//按照type所示条件升序排序
	
	public ArrayList<PlayerTechPO> descend(PlayerTechEnum type);
	//按照type所示条件降序排序
	
	public ArrayList<PlayerTechPO> sift(String position, String division, PlayerPO ptpo);
	/* 根据条件筛选并排序
	 * 可用作筛选条件的有：球员位置，球员联盟
	 * 可用作排序条件的有：球员名称，所属球队，参赛场数，先发场数，篮板数，助攻数，在场时间，投篮命中率，三分命中率，罚球命中率，进攻数，防守数，抢断数，盖帽数，失误数，犯规数，得分，效率，GmSc效率值，真实命中率，投篮效率，篮板率，进攻篮板率，防守篮板率，助攻率，抢断率，盖帽率，失误率，使用率
	 * 筛选条件作为特定属性存入ptpo
	 * 排序条件则为该项属性非0
	 * */
}

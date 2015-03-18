package dataservice;

import PO.TeamPO;

public interface TeamDataService {
	public TeamPO find(TeamPO tpo);
	/* 按照属性查找球队，属性存储在tpo中
	 * 可查找的条件有队名
	 * */
}

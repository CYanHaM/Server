package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.TeamPO;

public interface TeamDataService extends Remote{
	public TeamPO find(TeamPO tpo)throws RemoteException;
	/* 按照属性查找球队，属性存储在tpo中
	 * 可查找的条件有队名
	 * */
}

package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PlayerPO;
import PO.TeamPO;

public interface PlayerDataService extends Remote{
	public PlayerPO find(PlayerPO ppo)throws RemoteException;
	/* 按照属性查找球员，查找条件存储在ppo中
	 * 可查找的属性有姓名
	 * */
	
	public ArrayList<PlayerPO> findByTeam(TeamPO tpo)throws RemoteException;
	
	/* 按照球队查找球员，查找条件存储在tpo中
	 * 可查找的属性有队名
	 * */
}

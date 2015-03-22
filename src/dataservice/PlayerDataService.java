package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PlayerPO;
import PO.TeamPO;

public interface PlayerDataService extends Remote{
	public PlayerPO find(PlayerPO ppo)throws RemoteException;
	/* �������Բ�����Ա�����������洢��ppo��
	 * �ɲ��ҵ�����������
	 * */
	
	public ArrayList<PlayerPO> findByTeam(TeamPO tpo)throws RemoteException;
	
	/* ������Ӳ�����Ա�����������洢��tpo��
	 * �ɲ��ҵ������ж���
	 * */
}

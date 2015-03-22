package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.TeamTechPO;
import TypeEnum.TeamTechEnum;

public interface TeamTechDataService extends Remote{
	public ArrayList<TeamTechPO> ascend(TeamTechEnum type)throws RemoteException;
	// ����type ��ʾ������������
	
	public ArrayList<TeamTechPO> descend(TeamTechEnum type)throws RemoteException;
	//����type��ʾ������������
}

package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.TeamPO;

public interface TeamDataService extends Remote{
	public TeamPO find(TeamPO tpo)throws RemoteException;
	/* �������Բ�����ӣ����Դ洢��tpo��
	 * �ɲ��ҵ������ж���
	 * */
}

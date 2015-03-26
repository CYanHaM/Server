package dataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;

public interface PlayerTechDataService extends Remote{
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum type)throws RemoteException;
	//����type��ʾ������������
	
	public ArrayList<PlayerTechPO> descend(PlayerTechEnum type)throws RemoteException;
	//����type��ʾ������������
	
	public ArrayList<PlayerTechPO> sift(String position, String division, PlayerTechPO ptpo)throws RemoteException;
	/* ��������ɸѡ������
	 * ������ɸѡ�������У���Աλ�ã���Ա����
	 * �����������������У���Ա���ƣ�������ӣ������������ȷ������������������������ڳ�ʱ�䣬Ͷ�������ʣ����������ʣ����������ʣ���������������������������ñ����ʧ���������������÷֣�Ч�ʣ�GmScЧ��ֵ����ʵ�����ʣ�Ͷ��Ч�ʣ������ʣ����������ʣ����������ʣ������ʣ������ʣ���ñ�ʣ�ʧ���ʣ�ʹ����
	 * ɸѡ������Ϊ�ض����Դ���ptpo
	 * ����������Ϊ�������Է�0
	 * */
}

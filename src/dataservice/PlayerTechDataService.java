package dataservice;

import java.util.ArrayList;

import PO.PlayerTechPO;
import TypeEnum.PlayerTechEnum;

public interface PlayerTechDataService {
	public ArrayList<PlayerTechPO> ascend(PlayerTechEnum type);
	//����type��ʾ������������
	
	public ArrayList<PlayerTechPO> descend(PlayerTechEnum type);
	//����type��ʾ������������
	
	public ArrayList<PlayerTechPO> sift(PlayerTechPO ptpo);
	/* ��������ɸѡ������
	 * ������ɸѡ�������У�
	 * �����������������У�
	 * ɸѡ������Ϊ�ض����Դ���ptpo
	 * ����������Ϊ�������Է�0
	 * */
}

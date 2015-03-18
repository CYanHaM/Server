package dataservice;

import java.util.ArrayList;

import PO.PlayerPO;
import PO.TeamPO;

public interface PlayerDataService {
	public PlayerPO find(PlayerPO ppo);
	/* �������Բ�����Ա�����������洢��ppo��
	 * �ɲ��ҵ�����������
	 * */
	
	public ArrayList<PlayerPO> findByTeam(TeamPO tpo);
	
	/* ������Ӳ�����Ա�����������洢��tpo��
	 * �ɲ��ҵ������ж���
	 * */
}

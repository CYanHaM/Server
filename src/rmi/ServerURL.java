package rmi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ServerURL {
	/**
	 * @author hentai
	 * @date 2014��12��26��15:30:48
	 * @version 1
	 */
	//��������ַ�����������Լ�����ı仯��ʱ��ı�
	String Host;
	//����service��Ӧ�˿ںţ�һ������²����޸�
	String PlayerPort="5000";
	String TeamPort="5001";
	String PlayerTechPort="5002";
	String TeamTechPort="5003";
	
	public ServerURL(){
		InetAddress addr=null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Host=addr.getHostAddress().toString();
	}
	public String getHost() {
		return Host;
	}
	public String getPlayerPort(){
		return PlayerPort;
	}
	public String getPlayerTechPort(){
		return PlayerTechPort;
	}
	public String getTeamPort(){
		return TeamPort;
	}
	public String getTeamTechPort(){
		return TeamTechPort;
	}
}

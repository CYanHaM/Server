package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NoSuchObjectException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import data.TeamData;
import dataservice.TeamDataService;

public class StartTeamService {
	/**
	 * ע��Զ�̽ӿ�PlayerDataService
	 * @author Ni_Xiaofan
	 * @date 2014��12��23��
	 * @version 1
	 */

	//���幫����IP��ַ�Ͷ˿ڣ�������û���¼������set��get����
	String host;
	String port;
	Remote reg=null;
	public StartTeamService() throws RemoteException, MalformedURLException{
		ServerURL server = new ServerURL();
		host = server.getHost();
		System.out.println("host:"+host);
		port = server.getTeamPort();
		//�Ѷ˿ں�Զ�̶���UserDataע�ᵽRMIע���������
		reg=LocateRegistry.createRegistry(Integer.valueOf(port));
		TeamDataService teamdata = new TeamData();
		//�󶨵�URL��׼��ʽΪ��rmi://host:port/name(Э����rmi����ʡ��)
		Naming.rebind("//"+host+":"+port+"/TeamData", teamdata);
		System.out.println(">>>>>INFO:Զ��TeamData����󶨳ɹ���");
	}
	
	public void shutdown(){
		try {
			UnicastRemoteObject.unexportObject(reg, true);
		} catch (NoSuchObjectException e) {
			e.printStackTrace();
		}
		System.out.println("port shutdown successfully!");
	}
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}

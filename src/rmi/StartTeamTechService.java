package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NoSuchObjectException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import data.TeamTechData;
import dataservice.TeamTechDataService;

public class StartTeamTechService {
	/**
	 * 注册远程接口PlayerDataService
	 * @author Ni_Xiaofan
	 * @date 2014年12月23日
	 * @version 1
	 */

	//定义公开的IP地址和端口，方便多用户登录，并有set与get方法
	String host;
	String port;
	Remote reg=null;
	public StartTeamTechService() throws RemoteException, MalformedURLException{
		ServerURL server = new ServerURL();
		host = server.getHost();
		System.out.println("host:"+host);
		port = server.getTeamTechPort();
		//把端口和远程对象UserData注册到RMI注册服务器上
		reg=LocateRegistry.createRegistry(Integer.valueOf(port));
		TeamTechDataService teamtechdata = new TeamTechData();
		//绑定的URL标准格式为：rmi://host:port/name(协议名rmi可以省略)
		Naming.rebind("//"+host+":"+port+"/TeamData", teamtechdata);
		System.out.println(">>>>>INFO:远程TeamTechData对象绑定成功！");
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

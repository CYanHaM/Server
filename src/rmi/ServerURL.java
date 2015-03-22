package rmi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ServerURL {
	/**
	 * @author hentai
	 * @date 2014年12月26日15:30:48
	 * @version 1
	 */
	//服务器地址，随着主机以及网络的变化随时会改变
	String Host;
	//所有service对应端口号，一般情况下不会修改
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

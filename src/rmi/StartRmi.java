package rmi;

import java.rmi.RemoteException;

import data.SqlInitial;

public class StartRmi {

	
	public static void main(String[] args) throws RemoteException{
		new StartTeamTechService();
		new StartTeamService();
		new StartPlayerTechService();
		new StartPlayerService();
	//	SqlInitial.initial();
	}
}

package rmi;

import data.SqlInitial;

public class StartRmi {

	
	public static void main(String[] args){
		new StartTeamTechService();
		new StartTeamService();
		new StartPlayerTechService();
		new StartPlayerService();
		SqlInitial.initial();
	}
}

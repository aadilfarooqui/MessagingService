package com.task.client;

import com.task.base.Mediator;
import com.task.base.Player;
import com.task.Impl.MediatorImpl;
import com.task.Impl.PlayerImpl;

public class MessageClient {

	public static void executeClient(String firstName, String lastName){
		Mediator mediator = new MediatorImpl();
		//Add number of players as required by the task
		Player player1 = new PlayerImpl(mediator, firstName);
		Player player2 = new PlayerImpl(mediator, lastName);

		mediator.addPlayer(player1);
		mediator.addPlayer(player2);

		System.out.println("----Entering into the implementation----");
		//Fixed implementation for the Initiator Player (player1) to send a message 10 times and break the process
		for (int i=0; i<10; i++){
			player1.send("Message transmission ");
		}
		System.out.println("----Exiting implementation----");
	}

	public static void main(String[] args) {
		executeClient(args[0], args[1]);
	}

}

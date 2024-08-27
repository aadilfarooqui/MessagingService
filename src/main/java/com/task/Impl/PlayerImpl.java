package com.task.Impl;

import com.task.base.Mediator;
import com.task.base.Player;

/**
 * Implementation of Players class, where the logic to print the message while
 * Sending and receiving has to be maintained
 */
public class PlayerImpl extends Player{

	static int count = 0;
	public PlayerImpl(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + ": Send message: " + message);
		count++;
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + ": Received message: " + message + "count: " + count);
	}
	

}

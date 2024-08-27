package com.task.base;

/**
 * Implementation of Player class, which has to be responsible
 * for sending / receiving messages and returning count
 */
public abstract class Player {

	protected Mediator mediator;
	protected String name;
	protected int count;
	
	public Player(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
}

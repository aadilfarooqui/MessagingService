package com.task.base;

/**
 * Concrete Implementation of Mediator Pattern, to send a message and to add players (As many players required)
 */
public interface Mediator {
	
	public void sendMessage(String message, Player player);
	
	void addPlayer(Player player);

}

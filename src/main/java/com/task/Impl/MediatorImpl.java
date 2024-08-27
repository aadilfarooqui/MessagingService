package com.task.Impl;

import java.util.ArrayList;
import java.util.List;

import com.task.base.Mediator;
import com.task.base.Player;

/**
 * Override the method by placing a condition to identify the player only
 */
public class MediatorImpl implements Mediator{
	
	private List<Player> players;
	
	public MediatorImpl() {
		this.players = new ArrayList<Player>();
	}

	@Override
	public void sendMessage(String message, Player player) {
			for (Player player1 : players) {
				if (player1 != player) {
					player1.receive(message);
				}
			}
	}

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		this.players.add(player);
		
	}

	
}

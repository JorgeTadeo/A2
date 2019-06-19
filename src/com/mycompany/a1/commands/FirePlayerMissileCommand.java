package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;

public class FirePlayerMissileCommand extends Command{
	private GameWorld gw;
	
	public FirePlayerMissileCommand(GameWorld gw) {
		super("Add Player Missile");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e) {
		gw.addNonPlayerShip();
		System.out.print("Add Player Missile.");
	}
}

package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;

public class AddAsteroidCommand extends Command{
	
	private GameWorld gw;
	
	public AddAsteroidCommand(GameWorld gw) {
		super("Add Asteroid");
		this.gw = gw;
	}
	

	
	public void actionPerformed( ActionEvent e) {
		gw.addAsteroid();
		System.out.print("Add Asteroid.");
	}

}

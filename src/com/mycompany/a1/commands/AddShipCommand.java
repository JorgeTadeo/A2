package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;


public class AddShipCommand extends Command{

	private GameWorld gw;
	
	public AddShipCommand(GameWorld gw) {
		super("Add Ship");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e) {
		gw.addPlayerShip();
		System.out.print("Add PlayerShip.");
	}

}

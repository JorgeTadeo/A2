package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;

public class AddNonPlayerShip extends Command {
	
	private GameWorld gw;
	
	public AddNonPlayerShip(GameWorld gw) {
		super("Add Space Station");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e) {
		gw.addNonPlayerShip();
		System.out.print("Add Non Player Ship.");
	}
}

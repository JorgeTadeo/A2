package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;

public class JumpShipThroughHyperSpaceCommand extends Command{
	private GameWorld gw;
	
	public JumpShipThroughHyperSpaceCommand(GameWorld gw) {
		super("Add Jump Through Hyper Space");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e) {
		gw.addNonPlayerShip();
		System.out.print("Add Jump Through Hyper Space.");
	}
}

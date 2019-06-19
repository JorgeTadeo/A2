package com.mycompany.a1.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a1.game.GameWorld;

public class AddSpaceStationCommand extends Command {
	private GameWorld gw;
	
	public AddSpaceStationCommand(GameWorld gw) {
		super("Add Space Station");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e) {
		gw.addSpaceStation();
		System.out.print("Add Space Station.");
	}
}

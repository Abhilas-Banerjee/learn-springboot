package com.spring.selflearning.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game=game;		
	}

	public void run() {
		game.up();
		game.left();
		game.down();
		game.right();
		
	}
	

}

package com.spring.app;

import com.spring.app.game.GameRunner;
import com.spring.app.game.MarioGame;
import com.spring.app.game.SuperContraGame;

public class AppGamingBasicjava {

	public static void main(String[] args) {

		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}

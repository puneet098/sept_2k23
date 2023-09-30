package com.spring.app;

import com.spring.app.game.GameRunner;
import com.spring.app.game.PackmanGame;

public class AppGamingBasicjava {

	public static void main(String[] args) {

		System.out.println("hello");
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}

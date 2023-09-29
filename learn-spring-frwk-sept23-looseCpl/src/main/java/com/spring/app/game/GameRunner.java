package com.spring.app.game;

public class GameRunner {
	
	//MarioGame game;
	//private SuperContraGame game;
	private GamingConsole game;

	/**
	 * @param game
	 */
	public GameRunner(GamingConsole game) {
		
		this.game = game;
	}

	public void run() {
		System.out.println("Running game "+game);
		game.up();
		game.down();
		game.left();
		game.right();		
	}
	
	

}

package com.spring.app.game;

public class GameRunner {
	
	//MarioGame game;
	//private SuperContraGame game;
	private GamingConsole game;

	/**
	 * @param game
	 */
	/*
	 * public GameRunner(SuperContraGame game) {
	 * 
	 * this.game = game; }
	 */

	/**
	 * @param game
	 */
	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}
	
	//runner method
	public void run() {
		System.out.println("Running game "+game);
		game.up();
		game.down();
		game.left();
		game.right();		
	}


}

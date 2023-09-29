package com.spring.app.game;

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up");

	}

	@Override
	public void down() {
		System.out.println("sit down");
	}

	@Override
	public void left() {
		System.out.println("Go Back");

	}

	@Override
	public void right() {
		System.out.println("Shoot a bullet");

	}

}

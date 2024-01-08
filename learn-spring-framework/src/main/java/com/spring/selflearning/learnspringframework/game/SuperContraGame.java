package com.spring.selflearning.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Stop");
	}
	public void right() {
		System.out.println("Shoot");
	}

}

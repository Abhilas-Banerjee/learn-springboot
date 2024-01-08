package com.spring.selflearning.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameMovements {
	
	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("DOWN into a hole");
	}
	public void left() {
		System.out.println("Stop");
	}
	public void right() {
		System.out.println("Accelerate");
	}

}

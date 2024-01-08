package com.spring.selflearning.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.selflearning.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
//		GamingConsole  game=new PacmanGame();
//		GameRunner runner=new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		System.out.println(context.getBean(com.spring.selflearning.learnspringframework.enterprise.example.web.MyWebController.class).returnValueFromBusinessService());
		

	}

}

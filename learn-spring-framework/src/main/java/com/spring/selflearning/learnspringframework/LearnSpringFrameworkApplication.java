package com.spring.selflearning.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.selflearning.learnspringframework.game.GameRunner;


/*
 * What happens in the background?
 * First all the Classess annotated with @Component are identified
 * Second shared instance of singleton bean are created of the respective components by Spring
 * if any component is Autowired inside another component then that component's dependency is added to the external component.
 * In this case via constructor way
 * So Spring is managing the beans and their dependencies
 */
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
//		GamingConsole  game=new PacmanGame();
//		GameRunner runner=new GameRunner(game);
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		System.out.println(context.getBean(com.spring.selflearning.learnspringframework.enterprise.example.web.MyWebController.class).returnValueFromBusinessService());
		

	}

}

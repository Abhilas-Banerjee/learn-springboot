package com.bosch.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
//		Anonymous Inner Class Way
		Animal cat= new Animal() {
			
			@Override
			public void eat() {
				System.out.println("Cat is eating via Annonymous Inner Class");
				
			}
		};
		cat.eat();
		
		
		// Lambda Expression Way
		//(input parameters) -> {implementation of the code}
		Animal cat1=()->{
			System.out.println("Cat is eating via Lambda");
		};
		cat1.eat();
		
		//Predicate using Lambda Functions
		Predicate<String> predicate1=(s)->s.length()>10;
		System.out.println(predicate1.test("ABC"));
		
		//BiFunction using Lambda Function
		BiFunction<String, String, String> joinString=(s1,s2)-> s1+s2;
		System.out.println(joinString.apply("Abhilas", "Banerjee"));
		
		
		//Print hello World in a Separate Thread
		System.out.println("Hello World printed by: "+Thread.currentThread().getName());
		Runnable runnable= () -> System.out.println("Hello World Printed by: "+Thread.currentThread().getName());
		Thread thread= new Thread(runnable);
		thread.start();
		
		
		//Sort cars based on price
		Car car1= new Car("A",1000,450);
		Car car2= new Car("B",1400,150);
		Car car3= new Car("C",1500,350);
		Car car4= new Car("D",1100,250);
		Car car5= new Car("E",100,50);
		
		List<Car> cars= Arrays.asList(car1,car2,car3,car4,car5);
		Comparator<Car> comparator= (c1,c2)-> c1.price-c2.price;
		Collections.sort(cars,comparator);
		
		System.out.println(cars);
		
		

	}

}

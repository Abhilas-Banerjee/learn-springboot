package com.bosch.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bosch.lambda.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream is a pipeline and from the pipeline we will pass the data
		//Flow
		//Collections--> Create Stream--> Intermediate Functions--> Terminal Functions
		
		//Intermediate functions
		//Lazy in nature  since it does not update the original collection changes are made only on the stream
		//Eg 1: filter(Predicate<T>)
		//Eg 2: map(Function<T,U>) maps the input value to some output value.
		//Eg 3: flatMap(Functions<T,Stream<T>)--> converts List<List<Integer>> to a flat value only fetch List<Integer>
		
		//Terminal functions
		// If this functions are not executed original list is not modified
		
		List<Integer> numbers= Arrays.asList(1,4,2,3,6,10,9,8);
		
		//Way 1
		Stream<Integer> stream=numbers.stream();
		//Way 2
		//Stream<Integer> stream1=Stream.of(1,5,4,3,6);
		//Way 3
		Stream.Builder<Integer> builder= Stream.builder();
		//builder.add(1);
		
		List<Integer> oddNumbers = stream.filter(i-> i%2==1).collect(Collectors.toList());
		System.out.println(oddNumbers);
		
		
		//Sort cars based on price
				Car car1= new Car("A",1000,450);
				Car car2= new Car("B",1400,150);
				Car car3= new Car("C",1500,350);
				Car car4= new Car("D",1100,250);
				Car car5= new Car("E",100,50);
				
				List<Car> cars= Arrays.asList(car1,car2,car3,car4,car5);
				
				Stream <Car> stream1=cars.stream();
				List<Integer> carPrices=stream1.map((car)-> car.price).collect(Collectors.toList());
		
		

	}

}

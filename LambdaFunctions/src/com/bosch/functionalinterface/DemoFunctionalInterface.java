package com.bosch.functionalinterface;

/*Functional Interface
 * Single Abstract methods but any number of default methods
 * Can also have static methods
*/
@FunctionalInterface
public interface DemoFunctionalInterface {
	
	void run();//abstract method
	
	default void walk() {
		
	}

}

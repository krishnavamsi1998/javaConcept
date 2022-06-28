package javaconcepts;

// contains only one abstract method and can have any no of static and default methdos
// @FunctionalInterface tells the compiler to check whether it contains only one
// abstract method or not , however this is optional 
// lambda is used to implement functional interface
// runnable , comparable , callable are the in built functional interfaces provided by java

@FunctionalInterface
interface Car {
	
	int max_speed=100;
	
	void price(int price);

	static void color() {
		System.out.println("red");
	}

	default void wheels() {

		System.out.println("4 wheels");
	}

}

public class FunctionalInterfaceBasicExample{

	public static void main(String[] args) {

		Car ob = new Car() {

			@Override
			public void price(int price) {
				System.out.println("car price is " + price);
			}
		};
		
		System.out.println("max speed "+Car.max_speed);
		ob.price(220000);
		// accessed in static way
		Car.color();

		ob.wheels();

		// or

		Car obj = (a) -> System.out.println("car price is " + a);

		obj.price(300000);
		Car.color();

		ob.wheels();

	}

	

}

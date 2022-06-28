package javaconcepts;

import java.util.Random;

public class RandomNumberConcept {

	public static void main(String[] args) {

		// using random class
		Random r = new Random();

		// 0 to 9
		System.out.println(r.nextInt(10));

		// use random method
		// this would return double between 0.0 to 0.9
		// generates 0 to 9 , explicit type casting
		System.out.println((int) Math.floor(Math.random() * 10));

	}

}

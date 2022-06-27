package javaconcepts;

import java.util.stream.Stream;

public class StreamIterator {

	public static void main(String[] args) {

		Stream.iterate(1, a -> a + 1).filter(a -> a % 1 == 0).limit(20).forEach(System.out::println);
	}
//prints even numbers from 2 to till the count of numbers is 20
}

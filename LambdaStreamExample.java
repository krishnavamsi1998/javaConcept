package javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaStreamExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(-89);
		list.add(32);
		list.add(-99);

		Stream<Integer> data = list.stream().filter(a -> a > 0);

		data.forEach((a) -> System.out.println(a));

	}
}

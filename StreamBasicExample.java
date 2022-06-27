package javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Customer {

	String name;
	int score;

	public Customer(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

public class StreamListExample {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer("vamsi", 3000));
		list.add(new Customer("vishnu", 2000));
		list.add(new Customer("kartik", 900));

		// printing names of customers whose scores are above 1000
		List<String> scoreList = list.stream().filter(a -> a.score > 1000).map(a -> a.name)
				.collect(Collectors.toList());

		System.out.println(scoreList);

	}
	
	//op
	//vamsi , vishnu

}

package javaconcepts;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		
		List<Customer> list=new ArrayList<>();
		
		//new Customer(name,score)
		list.add(new Customer("vamsi",100));
		list.add(new Customer("asif",200));
		list.add(new Customer("ameer",500));
		
		//calculating sum of scores
		// the parameters need not be actual names
		Integer s = list.stream().map(a->a.score).reduce(0,(sum,score)->sum+score);
		System.out.println(s);
		
	}

}

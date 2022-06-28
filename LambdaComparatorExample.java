package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Kid {
	String name;
	int marks;

	Kid(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class LambdaComparatorExample {

	public static void main(String[] args) {

		List<Kid> list = new ArrayList<Kid>();

		list.add(new Kid("vamsi", 98));
		list.add(new Kid("arun", 90));

		System.out.println("without lambda sort in name ascending order");

		Collections.sort(list, new Comparator<Kid>() {

			public int compare(Kid a, Kid b) {
				return a.name.compareTo(b.name);
			}

		});

		list.forEach((e) -> System.out.println(e.name + " " + e.marks));

		System.out.println("using lambda sort in name ascending  order ");

		Collections.sort(list, (a, b) -> {
			return a.name.compareTo(b.name);
		});

		list.forEach((e) -> System.out.println(e.name + " " + e.marks));

		System.out.println("using lambda sort in marks reverse order");

		Collections.sort(list, (a, b) -> {
			if (a.marks > b.marks)
				return -1;
			else
				return 1;
		});
		list.forEach((e) -> System.out.println(e.name + " " + e.marks));

	}

}

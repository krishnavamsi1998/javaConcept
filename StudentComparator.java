package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparator {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student("vamsi", 18, 85));
		list.add(new Student("karthik", 15, 35));
		list.add(new Student("abhay", 19, 15));
		list.add(new Student("chandu", 20, 95));

		System.out.println("sorting by name");
		Collections.sort(list, new NameComparator());

		for (Student st : list)
			System.out.println(st.toString());

		System.out.println();
		System.out.println("sorting by age");
		Collections.sort(list, new AgeComparator());
		for (Student st : list)
			System.out.println(st.toString());

		System.out.println();
		System.out.println("sorting by marks");
		Collections.sort(list, new MarksComparator());
		for (Student st : list)
			System.out.println(st.toString());

	}

}

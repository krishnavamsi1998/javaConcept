package javaconcepts;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		//ascending
		
		if(o1.age <o2.age)
			return -1;
		else if(o1.age >o2.age)
			return 1;
		else
			return 0;
	}
	

}

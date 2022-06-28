package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;

//Comparable Example

public class Employe implements Comparable<Employe> {

	String name;
	int age;
	int salary;

	public Employe(String name, int age, int salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employe e) {
		//return positve if swap
		//return negative if dont want to swap
		//return 0 if equal
		
		if (this.getAge() < e.getAge())
			return 1;
		else if (this.getAge() > e.getAge())
			return -1;
		else
			return 0;

	}

	
	public static void main(String[] args) {
		
		ArrayList<Employe> list=new ArrayList<Employe>();
		
		System.out.println("sorting in reverse age");
		
		list.add(new Employe("vamsi",24, 50000));
		list.add(new Employe("vishnu",26, 20000));

		list.add(new Employe("pranay",20, 30000));
		list.add(new Employe("kartik",27, 40000));
		
		Collections.sort(list);
		
		for(Employe emp:list)
		System.out.println(emp.toString());
		
		
		
	}

}

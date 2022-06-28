package javaconcepts;

public class Student {

	String name;
	int age;
	int marks;

	public Student(String name, int age, int marks) {

		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}

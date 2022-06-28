package javaconcepts;

//without this
public class This {

	String name;
	int marks;

	This(String name, int marks) {

		//name = name;
		//marks = marks;
		this.name=name;
		this.marks=marks;

	}

	void display() {

		System.out.println(name + " " + marks);
	}

	public static void main(String[] args) {

		This obj = new This("vamsi", 100);
		obj.display();

	}

}

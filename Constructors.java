package javaconcepts;

public class Constructors {
	
	Constructors(){
		System.out.println("in default constructor");
	}
	
	Constructors(String x){
		this();
		System.out.println("in parameterized constructor "+x);
		
	}

	public static void main(String[] args) {

	//Constructors obj=new Constructors();
		Constructors obj1=new Constructors("vamsi");
		
		
	}

}

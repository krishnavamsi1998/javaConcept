package javaconcepts;

class Employee{
	
	String name;
	int age;
	int salary;
	
	public Employee(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		//if same object is passed in comparision
		
		if(this==obj)
			return true;
		// if comparison object is null
		
		if(obj==null)
			return false;
		
		// if object classes are different
		
		if(this.getClass() != obj.getClass())
			return false;
		
		//type casting the obj
		Employe emp=(Employe)obj;
		
		//.equals checks the content
		//== checks the reference
		
		return this.name.equals(emp.name) && this.age==emp.age;
		
	}
	
}
public class CompareObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe e1=new Employe("vamsi",24,45000);
		Employe e2=new Employe("vamsi",24,45000);
		
		System.out.println(e1.equals(e2));

	}

	

}

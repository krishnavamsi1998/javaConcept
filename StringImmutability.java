package javaconcepts;


public class StringImmutability {

	public static void main(String[] args) {
		
		String s="krishna";
		System.out.println(s.hashCode());
		//new string object gets created 
		s+=" vamsi";
		System.out.println(s.hashCode());
		
		System.out.println(s);
	}

}

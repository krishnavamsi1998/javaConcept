package javaconcepts;

/*hashCode in Java helps the program to run faster.
For example, comparing two objects by their hashcodes will give 
the result 20 times faster than comparing them using the equals() function.
This is so because hash data structures like HashMaps, internally organize 
the elements in an array-based data structure. So while the equals() function 
first checks if two objects are the same and then compares the value of the objects’ attributes, 
the hashCode method compares them by using only their hash codes and gives us a conclusion.*/
public class HashCode {
	
	public static void main(String[] args) {
		 String a = "100";
	      String b = "100";
	      if(a.equals(b))
	      {
	        System.out.println("Equal variables:");
	        System.out.println(a.hashCode() + "\n" + b.hashCode());
	      }
	      
	      String c = "100";
	      String d = "500";
	 
	      if(!c.equals(d))
	      {
	          System.out.println("\nUn-equal variables:");
	          System.out.println(c.hashCode() + "\n" + d.hashCode());
	      }
	      String Str = new String("We are learning hashCode in Java");
	      System.out.println("Hashcode for Str :" + Str.hashCode() );
	      
	      //This method returns the hashcode for the 
	      //integer value passed through the function.
	      
	      int hashValue=Integer.hashCode(12);
	      System.out.println(hashValue);
	}

}

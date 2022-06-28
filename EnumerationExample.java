package javaconcepts;

import java.util.Enumeration;
import java.util.Vector;

//used for any vector type 
// hasMoreElements() & nextElement() method is used 
public class EnumerationExample {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(0);
		v.add(1);
		v.add(2);
		v.add(3);

		// we use elements() to generate enumeration
		Enumeration<Integer> i = v.elements();

		while (i.hasMoreElements())
			System.out.println(i.nextElement());

	}

}

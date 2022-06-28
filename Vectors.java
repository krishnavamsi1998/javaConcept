package javaconcepts;

import java.util.Iterator;
import java.util.Vector;
import java.util.ArrayList;

//its optional to specify the type of vectors , arraylist , etc ?
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add("vamsi");
		v.add(100);

		Iterator i = v.iterator();

		while (i.hasNext())
			System.out.println(i.next());

		ArrayList list = new ArrayList();

		list.add("krishna");
		list.add(99);

		Iterator j = list.iterator();

		while (j.hasNext())
			System.out.println(j.next());

	}

}

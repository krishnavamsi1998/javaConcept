package javaconcepts;

// to simply say a class which has no name is called Anonymous inner class
// compiler decides its name and implements or extends
// it should be used whenever u want to override 
// it can implement only one interface at a time
// we cannot create a constructor  for anonymous inner class

interface Bike {
	void speed(int x);
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Bike ob = new Bike() {

			@Override
			public void speed(int x) {
				System.out.println("Bike speed is " + x);

			}

		};
		ob.speed(100);

	}

}

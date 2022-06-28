package javaconcepts;

// lambda are introduced as a part of java 8
// lambda provides the implementation of functional interface
// by default method access modifier is public  in interface
// and fields are public,static,final

@FunctionalInterface // optional
interface Test {
	void test();

}

public class LambdaBasicExample {

	public static void main(String[] args) {

		Test obj = new Test() {

			public void test() {
				System.out.println("Testing");

			}

		};

		obj.test();

		// or

		Test obj1 = () -> System.out.println("Testing");

		obj1.test();

	}

}

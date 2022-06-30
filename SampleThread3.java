package javaRelated;

// using runnable class by lambda
public class SampleThread3 {

	public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("thread " + Thread.currentThread().getName() + " is running");

		Thread t1 = new Thread(r1);
		t1.setName("vamsi");
		t1.start();
	}

	// op:thread vamsi is running

}

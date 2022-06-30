package javaRelated;

public class SampleThread4 {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread " + Thread.currentThread().getName() + " is running");

			}

		};

		Thread t1 = new Thread(r1);
		t1.setName("krishna");
		t1.start();

	}
	// op :Thread krishna is running

}

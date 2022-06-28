package javaconcepts;

public class LambdaThreadExample {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("t1 running");

			}

		};

		Runnable r2 = () -> System.out.println("t2 running");

		Thread t1 = new Thread(r1);
		t1.start();

		Thread t2 = new Thread(r2);
		t2.start();

		/// or

		new Thread(() -> System.out.println("t3 running")).start();

	}

}

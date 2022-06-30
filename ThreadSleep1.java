package javaRelated;

public class ThreadSleep1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(3000);

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) {

		ThreadSleep1 t1 = new ThreadSleep1();
		ThreadSleep1 t2 = new ThreadSleep1();
		t1.start();
		// t2.start();

	}
	// op : prints 0 to 4 with gap of 3 seconds

}

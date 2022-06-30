package javaRelated;

public class SampleThread1 extends Thread {

	public void run() {
		System.out.println("thread " + Thread.currentThread().getName() + " is running");
	}

	public static void main(String[] args) {

		SampleThread1 t1 = new SampleThread1();
		t1.start();

	}

}

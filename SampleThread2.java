package javaRelated;

//by implementing runnable interface

public class SampleThread2 implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread " + Thread.currentThread().getName() + " is running");
	}

	public static void main(String[] args) {

		SampleThread2 obj = new SampleThread2();
		Thread t1 = new Thread(obj);
		t1.start();

	}

	// op : Thread Thread-0 is running

}

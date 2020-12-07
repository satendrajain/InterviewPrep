package com.prog.vipul.multithreading;

public class Print3Threads {

	public static void main(String[] args) {

		Printremainder printer1 = new Printremainder(0);
		Printremainder printer2 = new Printremainder(1);
		Printremainder printer3 = new Printremainder(2);

		Thread t1 = new Thread(printer1, "T1");
		Thread t2 = new Thread(printer2, "T2");
		Thread t3 = new Thread(printer3, "T3");

		t1.start();
		t2.start();
		t3.start();

	}
}

class Printremainder implements Runnable {

	public int MAX = 12;
	static int number = 0;
	int remainder;
	static Object obj = new Object();

	public Printremainder(int i) {
		this.remainder = i;
	}

	@Override
	public void run() {

		while (number < MAX) {

			synchronized (obj) {

				while (number % 3 != remainder) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "::" + number);
				number++;
				obj.notifyAll();

			}
		}

	}

}

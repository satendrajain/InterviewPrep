package com.prog.vipul.multithreading;

public class EvenOdd {

	public static void main(String[] args) {

		Printer pw = new Printer();

		Thread even = new Thread(new TaskOddEven(pw, 10, false), "Even");
		Thread odd = new Thread(new TaskOddEven(pw, 10, true), "Odd");

		even.start();
		odd.start();
	}
}

class TaskOddEven implements Runnable {

	private Printer pw;
	private int MAX;
	private boolean isOdd;

	public TaskOddEven(Printer pw, int MAX, boolean isOdd) {
		this.pw = pw;
		this.MAX = MAX;
		this.isOdd = isOdd;
	}

	@Override
	public void run() {

		int start = isOdd ? 1 : 2;
		while (start <= MAX) {
			if (!isOdd) {
				pw.printEven(start);
			} else {
				pw.printOdd(start);
			}
			start += 2;
		}

	}

}

class Printer {

	private volatile boolean isOdd = false;

	public synchronized void printEven(int i) {

		while (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				// Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + "::" + i);
		isOdd = false;
		notify();

	}

	public synchronized void printOdd(int i) {

		while (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				// Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + "::" + i);
		isOdd = true;
		notify();

	}

}
package com.prog.vipul.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWaitNotify {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int size = 10;

		Thread producer = new Thread(new Producer(list, size));
		Thread consumer = new Thread(new Consumer(list, size));

		producer.start();
		consumer.start();
	}
}

class Producer implements Runnable {

	private List<Integer> list;
	private int size;

	public Producer(List<Integer> list, int size) {
		this.list = list;
		this.size = size;
	}

	@Override
	public void run() {

		for (int i = 0; i < size; i++) {
			System.out.println("Produced::" + i);
			try {
				produce(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void produce(int i) throws InterruptedException {

		// wait if queue is full
		while (list.size() == size) {
			synchronized (list) {
				 System.out.println("Queue is full " + Thread.currentThread().getName()
                         + " is waiting , size: " + list.size());
				list.wait();
			}

		}

		// producing element and notify consumers
		synchronized (list) {
			list.add(i);
			list.notifyAll();
		}
	}

}

class Consumer implements Runnable {

	private List<Integer> list;
	private int size;

	public Consumer(List<Integer> list, int size) {
		this.list = list;
		this.size = size;
	}

	@Override
	public void run() {

		while (true) {

			try {
				consume();
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {

		// wait if queue has nothing
		while (list.size() == 0) {
			synchronized (list) {
				System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + list.size());
				list.wait();
			}

		}

		synchronized (list) {

			int abc = list.remove(0);
			System.out.println("Consumed::" + abc);
		}

	}

}
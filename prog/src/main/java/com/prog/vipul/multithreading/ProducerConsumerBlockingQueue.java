package com.prog.vipul.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(10);

		Thread producer = new Thread(new Producer1(queue), "Producer");
		Thread consumer = new Thread(new Consumer1(queue), "Consumer");

		producer.start();
		consumer.start();
	}
}

class Producer1 implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer1(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Produced::" + i);
			try {
				queue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Consumer1 implements Runnable {

	private BlockingQueue<Integer> queue;

	public Consumer1(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {

			try {
				System.out.println("Consumed: " + queue.take());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
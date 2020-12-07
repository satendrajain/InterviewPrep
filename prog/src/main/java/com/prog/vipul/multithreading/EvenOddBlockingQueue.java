package com.prog.vipul.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EvenOddBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
		queue.put(1);
		
		Thread even = new Thread(new EvenTask(queue, 50), "Even");
		Thread odd = new Thread(new OddTask(queue, 50), "Odd");

		even.start();
		odd.start();
	}
}

class EvenTask implements Runnable {

	private BlockingQueue<Integer> queue;
	private int MAX;
	
	public EvenTask(BlockingQueue<Integer> queue, int MAX) {
		this.queue = queue;
		this.MAX = MAX;
	}

	@Override
	public void run() {
		
		try {
			while(queue.size()!=MAX) {
				int i = queue.take();
				if(i%2==0) {
					System.out.println("Even::"+i);
					queue.put(i+1);
				}
				break;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
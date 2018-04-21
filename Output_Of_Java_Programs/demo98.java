package Output_Of_Java_Programs;

import java.util.ArrayList;

/*OUTPUT

Consumer waiting for production to get over.
Producer is still Producing, Produced : 1
Producer is still Producing, Produced : 2
Producer is still Producing, Produced : 3
Production is over, consumer can consume.
Consumed : 1
Consumed : 2
Consumed : 3
 
*/

public class demo98 {

	public static void main(String[] args) throws InterruptedException {
		Producer prod = new Producer();
		Consumer cons = new Consumer(prod);

		Thread prodThread = new Thread(prod, "prodThread");
		Thread consThread = new Thread(cons, "consThread");

		consThread.start();
		Thread.sleep(100); // minor delay.
		prodThread.start();

	}

}

class Producer implements Runnable {

	ArrayList<Integer> sharedQueue;

	Producer() {
		sharedQueue = new ArrayList<Integer>();
	}

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 3; i++) { // Producer will produce 10 products
				sharedQueue.add(i);
				System.out.println("Producer is still Producing, Produced : " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println("Production is over, consumer can consume.");
			this.notify();
		}
	}

}

class Consumer extends Thread {
	Producer prod;

	Consumer(Producer obj) {
		prod = obj;
	}

	public void run() {
		synchronized (this.prod) {

			System.out.println("Consumer waiting for production to get over.");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		int productSize = this.prod.sharedQueue.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("Consumed : " + this.prod.sharedQueue.remove(0) + " ");

	}

}
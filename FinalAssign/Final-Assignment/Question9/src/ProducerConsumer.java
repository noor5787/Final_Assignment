import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
	private static final int MAX_SIZE = 10;
	private static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());

		producerThread.start();
		consumerThread.start();
	}

	static class Producer implements Runnable {
		private Random random = new Random();

		@Override
		public void run() {
			while (true) {
				synchronized (queue) {
					while (queue.size() == MAX_SIZE) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					int number = random.nextInt(100);
					queue.offer(number);
					System.out.println("Produced: " + number);
					queue.notifyAll();
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class Consumer implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					int number = queue.poll();
					System.out.println("Consumed: " + number);
					int sum = calculateSum();
					System.out.println("Sum: " + sum);
					queue.notifyAll();
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private int calculateSum() {
			int sum = 0;
			for (int number : queue) {
				sum += number;
			}
			return sum;
		}
	}
}

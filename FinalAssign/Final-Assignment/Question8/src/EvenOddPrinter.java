public class EvenOddPrinter {
	public static void main(String[] args) {
		// Create two threads
		Thread evenThread = new Thread(new EvenNumberPrinter());
		Thread oddThread = new Thread(new OddNumberPrinter());

		// Start the threads
		evenThread.start();
		oddThread.start();
	}
}

class EvenNumberPrinter implements Runnable {
	@Override
	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even number: " + i);
		}
	}
}

class OddNumberPrinter implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 9; i += 2) {
			System.out.println("Odd number: " + i);
		}
	}
}

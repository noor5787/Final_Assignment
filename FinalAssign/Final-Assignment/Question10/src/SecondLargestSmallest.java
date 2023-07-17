import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestSmallest {
	public static void main(String[] args) {
		List<Integer> numbers = readIntegersFromUser();

		if (numbers.isEmpty()) {
			System.out.println("No numbers entered.");
			return;
		}

		int secondLargest = findSecondLargest(numbers);
		int secondSmallest = findSecondSmallest(numbers);

		System.out.println("Second largest number: " + secondLargest);
		System.out.println("Second smallest number: " + secondSmallest);
	}

	private static List<Integer> readIntegersFromUser() {
		List<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of integers: ");
		int count = scanner.nextInt();

		System.out.println("Enter the integers:");
		for (int i = 0; i < count; i++) {
			int number = scanner.nextInt();
			numbers.add(number);
		}

		return numbers;
	}

	private static int findSecondLargest(List<Integer> numbers) {
		Collections.sort(numbers);
		int size = numbers.size();

		if (size < 2) {
			throw new IllegalArgumentException("List should contain at least two elements.");
		}

		return numbers.get(size - 2);
	}

	private static int findSecondSmallest(List<Integer> numbers) {
		Collections.sort(numbers);
		int size = numbers.size();

		if (size < 2) {
			throw new IllegalArgumentException("List should contain at least two elements.");
		}

		return numbers.get(1);
	}
}

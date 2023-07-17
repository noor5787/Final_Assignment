import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the sorted array
		System.out.print("Enter the sorted array elements (space-separated): ");
		String[] arrayValues = scanner.nextLine().split(" ");
		int[] sortedArray = Arrays.stream(arrayValues).mapToInt(Integer::parseInt).toArray();

		// Input the target value
		System.out.print("Enter the target value: ");
		int target = scanner.nextInt();

		// Perform binary search
		int index = binarySearch(sortedArray, target);

		// Print the result
		if (index != -1) {
			System.out.println("Target value found at index " + index);
		} else {
			System.out.println("Target value not found in the array.");
		}
	}

	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = array[mid];

			if (guess == target) {
				return mid;
			} else if (guess < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1; // Target value not found
	}
}

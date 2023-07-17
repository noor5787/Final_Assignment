import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {
	public static void main(String[] args) {
		// Create a large data set
		List<Integer> data = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			data.add(i);
		}

		// Perform sorting operation
		List<Integer> sortedData = data.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Data: " + sortedData);

		// Perform filtering operation
		List<Integer> filteredData = data.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println("Filtered Data (Even numbers): " + filteredData);
	}
}

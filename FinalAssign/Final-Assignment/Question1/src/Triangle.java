import java.util.Scanner;

public class Triangle implements Shape {

	private float base;
	private float height;

	@Override
	public float calculateArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the base length of triangle");
		float base = scanner.nextFloat();
		System.out.println("Please Enter the height length of triangle");
		float height = scanner.nextFloat();
		float area = 0.5f * base * height;
		return area;
	}

	@Override
	public float calculatePerimeter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the base length of triangle");
		float base = scanner.nextFloat();
		System.out.println("Please Enter the side1 length of triangle");
		float side1 = scanner.nextFloat();
		System.out.println("Please Enter the side2 length of triangle");
		float side2 = scanner.nextFloat();
		float perimeter = base + side1 + side2;
		return perimeter;
	}

}

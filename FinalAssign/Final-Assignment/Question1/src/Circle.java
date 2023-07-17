import java.util.Scanner;

public class Circle implements Shape {

	private float radius;
	private final float pi = 3.14f;
	private float diameter;

	@Override
	public float calculateArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the radius of the circle");
		float radius = scanner.nextFloat();
		float area = pi * radius * radius;
		return area;
	}

	@Override
	public float calculatePerimeter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the radius of the circle");
		float radius = scanner.nextFloat();
		diameter = radius * 2;
		float perimeter = pi * diameter;
		return perimeter;
	}

}

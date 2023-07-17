
public class ShapeApp {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape triangle = new Triangle();

		float circleArea = circle.calculateArea();
		System.out.println("The area of circle is :: " + circleArea);

		float circlePerimeter = circle.calculatePerimeter();
		System.out.println("The perimeter of circle is :: " + circlePerimeter);

		float triangleArea = triangle.calculateArea();
		System.out.println("The area of triangle is :: " + triangleArea);

		float trianglePerimeter = triangle.calculatePerimeter();
		System.out.println("The perimeter of triangle is :: " + trianglePerimeter);

	}

}

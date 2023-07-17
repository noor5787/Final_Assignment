
public class TestApp extends Abstractclass implements Sampleinterface {

	public static void main(String[] args) {

	}

	@Override
	public void methodTwo() {
		System.out.println("Implementation of method two from main class");

	}

	/*
	 * In general, you should use an interface when you want to define a set of
	 * behaviors that a class must implement. You should use an abstract class when
	 * you want to provide a base class for concrete subclasses to inherit from.
	 * 
	 * Here are some additional reasons why you might use an abstract class instead
	 * of an interface:
	 * 
	 * An abstract class can have state. This means that an abstract class can have
	 * instance variables. An interface cannot have state. An abstract class can
	 * have constructors. This means that an abstract class can be used to create
	 * objects. An interface cannot be used to create objects. An abstract class can
	 * have non-abstract methods. This means that an abstract class can have methods
	 * that have implementations. An interface can only have abstract methods.
	 */
}

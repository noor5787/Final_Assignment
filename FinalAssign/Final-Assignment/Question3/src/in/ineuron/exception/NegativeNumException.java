package in.ineuron.exception;

public class NegativeNumException extends Exception {

	@Override
	public String getMessage() {
		return "The Number Entered is NEGATIVE";
	}

}

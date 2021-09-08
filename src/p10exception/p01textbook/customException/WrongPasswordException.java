package p10exception.p01textbook.customException;

public class WrongPasswordException extends Exception{

	public WrongPasswordException() {
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}

package app;

public class NotNumberException extends Exception {
	NotNumberException() {}

	NotNumberException(String msg) {
		super(msg);
	}
}

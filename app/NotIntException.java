package app;

class NotIntException extends Exception {
	NotIntException() {}

	NotIntException(String msg) {
		super(msg);
	}
}

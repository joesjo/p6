package exceptions;

public class InvalidLengthException extends RuntimeException {

	/**
	 * @author str4zan
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidLengthException() {
        super();
    }

    public InvalidLengthException(String message) {
        super(message);
    }

}

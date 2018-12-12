package exceptions;

public class InvalidInputException extends RuntimeException {
	/**
	 * @author str4zan
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }

}


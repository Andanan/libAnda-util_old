package libanda.util.exception;

public class UnimplementedException extends Exception {

	private static final long serialVersionUID = -4175949360145445853L;

	public UnimplementedException() {
		super();
	}

	public UnimplementedException(String message) {
		super(message);
	}

	public UnimplementedException(Throwable cause) {
		super(cause);
	}

	public UnimplementedException(String message, Throwable cause) {
		super(message, cause);
	}

}

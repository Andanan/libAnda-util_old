package libanda.util.exception;

/**
 * A custom exception, intended for use in unimplemented methods
 * 
 * 
 * @author Andanan
 * @lastModified 2017-02-26
 * @version 1.0
 */
@Deprecated // included in apache-commons-lang
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

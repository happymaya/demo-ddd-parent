package cn.happymaya.ddp.support.exception;

/**
 * @author superhsc
 */
public class QueryException extends RuntimeException {

	private static final long serialVersionUID = -4221944651020677138L;

	/**
	 * QueryException
	 */
	public QueryException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * QueryException
	 * @param message message
	 * @param cause cause
	 * @param enableSuppression enable suppression
	 * @param writableStackTrace writable stackTrace
	 */
	public QueryException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * QueryException
	 * @param message message
	 * @param cause cause
	 */
	public QueryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * QueryException
	 * @param message message
	 */
	public QueryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * QueryException
	 * @param cause cause
	 */
	public QueryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}

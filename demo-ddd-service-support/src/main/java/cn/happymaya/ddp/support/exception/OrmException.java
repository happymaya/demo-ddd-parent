package cn.happymaya.ddp.support.exception;

/**
 * @author superhsc
 */
public class OrmException extends RuntimeException {

	private static final long serialVersionUID = -6657470429383742870L;

	/**
	 * ORM exception
	 */
	public OrmException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message message
	 */
	public OrmException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause cause
	 */
	public OrmException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message message
	 * @param cause cause
	 */
	public OrmException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message message
	 * @param cause cause
	 * @param enableSuppression enable suppression
	 * @param writableStackTrace writable stack trade
	 */
	public OrmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

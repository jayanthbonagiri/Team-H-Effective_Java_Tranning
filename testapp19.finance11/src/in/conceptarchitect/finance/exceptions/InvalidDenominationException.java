package in.conceptarchitect.finance.exceptions;

public class InvalidDenominationException extends BankingException {

	public InvalidDenominationException(int accountNumber) {
		super(accountNumber,"Invalid Denominations");
		// TODO Auto-generated constructor stub
	}

	public InvalidDenominationException(int accountNumber, String message) {
		super(accountNumber, message);
		// TODO Auto-generated constructor stub
	}

	public InvalidDenominationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDenominationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDenominationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

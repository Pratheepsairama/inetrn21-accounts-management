package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

public class AccountNotFoundExceptionClass extends RuntimeException {

public AccountNotFoundExceptionClass() {
		
	}

	public AccountNotFoundExceptionClass(String message) {
		super(message);
		
	}

	public AccountNotFoundExceptionClass(Throwable cause) {
		super(cause);
		
	}

	public AccountNotFoundExceptionClass(String message, Throwable cause) {
		super(message, cause);
		
	}

	public AccountNotFoundExceptionClass(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}

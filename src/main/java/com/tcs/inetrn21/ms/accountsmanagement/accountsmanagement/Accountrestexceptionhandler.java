package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
public class Accountrestexceptionhandler {
	@ExceptionHandler
	public ResponseEntity <Accounterrorresponsepage> handleException(AccountNotFoundExceptionClass exc)
	{
		Accounterrorresponsepage error = new Accounterrorresponsepage(HttpStatus.NOT_FOUND.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<Accounterrorresponsepage> handleException(Exception exc)
	{	
		Accounterrorresponsepage error = new Accounterrorresponsepage(HttpStatus.BAD_REQUEST.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	

}

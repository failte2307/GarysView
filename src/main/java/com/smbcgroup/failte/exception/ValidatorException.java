package com.smbcgroup.failte.exception;

 
/**
 * @author Mark
 * 16 Jun 2019
 */
public class ValidatorException extends Exception {
	private static final long serialVersionUID= -4167848436423642L;
	
	public ValidatorException(Throwable t) {
		this(t.getMessage(),t);
	}
	
	public ValidatorException(String message) {
		
		this(message, null);
	}
	
public ValidatorException(String message, Throwable t) {
		
		super(message, t);
	}

}

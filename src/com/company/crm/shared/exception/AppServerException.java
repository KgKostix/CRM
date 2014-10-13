package com.company.crm.shared.exception;

public class AppServerException extends Exception {
	private static final long serialVersionUID = 1107160643833888301L;
	private String exceptionCode;
	
	
	public AppServerException() {
		super();
	}
	
	public AppServerException(String message) {
		super(message);
	}

	public String getExceptionCode() {
		return exceptionCode;
	}
	
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
}

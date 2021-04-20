package com.zalando.demo.exception;

import java.net.URI;
import java.util.Map;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.StatusType;
import org.zalando.problem.ThrowableProblem;

import com.zalando.demo.enums.ErrorCodeType;

public class UserException extends GenericException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ErrorCodeType exceptionType;

	
	




	public UserException(URI type, String title, StatusType status, String detail, URI instance, ThrowableProblem cause,
			Map<String, Object> parameters) {
		super(type, title, status, detail, instance, cause, parameters);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type, String title, StatusType status, String detail, URI instance,
			ThrowableProblem cause) {
		super(type, title, status, detail, instance, cause);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type, String title, StatusType status, String detail, URI instance) {
		super(type, title, status, detail, instance);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type, String title, StatusType status, String detail) {
		super(type, title, status, detail);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type, String title, StatusType status) {
		super(type, title, status);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type, String title) {
		super(type, title);
		// TODO Auto-generated constructor stub
	}







	public UserException(URI type) {
		super(type);
		// TODO Auto-generated constructor stub
	}







	@Override
	public ErrorCodeType exceptionType() {
		return this.exceptionType;
	}
	
	
	

	

}

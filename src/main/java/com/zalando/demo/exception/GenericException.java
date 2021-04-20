package com.zalando.demo.exception;

import java.net.URI;
import java.util.Map;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.StatusType;
import org.zalando.problem.ThrowableProblem;

import com.zalando.demo.enums.ErrorCodeType;

public abstract class GenericException extends AbstractThrowableProblem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object[] parameters;

	public abstract ErrorCodeType exceptionType();
	
	public GenericException(URI type, String title, StatusType status, String detail, URI instance,
			ThrowableProblem cause, Map<String, Object> parameters) {
		super(type, title, status, detail, instance, cause, parameters);
	}

	public GenericException(URI type, String title, StatusType status, String detail, URI instance,
			ThrowableProblem cause) {
		super(type, title, status, detail, instance, cause);
	}

	public GenericException(URI type, String title, StatusType status, String detail, URI instance) {
		super(type, title, status, detail, instance);
	}

	public GenericException(URI type, String title, StatusType status, String detail) {
		super(type, title, status, detail);
	}

	public GenericException(URI type, String title, StatusType status) {
		super(type, title, status);
	}

	public GenericException(URI type, String title) {
		super(type, title);
	}

	public GenericException(URI type) {
		super(type);
	}

	public Object[] getMessageParameters() {
		return this.parameters;
	}

}

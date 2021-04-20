package com.zalando.demo.enums;

public enum UserExceptionType implements ErrorCodeType {

	// @formatter:off
	ACTIVE_RECORD_BY_ID_NOT_FOUND("active.record.by.id.not.found", USER_EXCEPTION_TITLE),
	MALFORMED_URL("malformed.url", USER_EXCEPTION_TITLE),
	URL_HOST_NOT_AVALABLE("url.host.not.avalable", USER_EXCEPTION_TITLE),
	DUPLICATE_URL("duplicate.url", USER_EXCEPTION_TITLE);
	// @formatter:on

	private final String errorCode;

	private final String title;

	private UserExceptionType(String errorCode, String title) {
		this.errorCode = errorCode;
		this.title = title;
	}

	private UserExceptionType(String errorCode) {
		this.errorCode = errorCode;
		this.title = USER_EXCEPTION_TITLE;
	}

	@Override
	public String errorCode() {
		return this.errorCode;
	}

	@Override
	public String title() {
		return this.title;
	}

}
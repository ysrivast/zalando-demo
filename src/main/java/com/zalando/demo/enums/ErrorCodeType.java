package com.zalando.demo.enums;

public interface ErrorCodeType {
	
	static final String USER_EXCEPTION_TITLE = "Post exception";

    public String errorCode();

    public String title();
}
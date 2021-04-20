package com.zalando.demo.exception;

import lombok.Data;

@Data
public class ErrorDetail {
	
	private String message;
	private String detail;
}

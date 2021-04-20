package com.zalando.demo.exception;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.zalando.problem.Problem;
import org.zalando.problem.ProblemBuilder;
import org.zalando.problem.Status;
import org.zalando.problem.spring.web.advice.ProblemHandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class CustomExceptionHandler implements ProblemHandling {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<Problem> handleUserNotFoundException(UserException ex ,NativeWebRequest request) {
//		return ResponseEntity.of(
//				Optional.of(
//						Problem.builder()
//							.withTitle("User not found")
//							.withDetail(exception.getLocalizedMessage())
//							.withStatus(Status.NOT_FOUND)
//							.build()));
		log.error("Cause : {} ", ex.getCause());
		ProblemBuilder problemBuilder = Problem.builder()
				.withType(ex.getType())
				.withStatus(ex.getStatus())
				.withTitle("User not found")
				.withDetail(ex.getLocalizedMessage())
				.withStatus(Status.NOT_FOUND);
		return create(ex, problemBuilder.build(), request);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Problem> handleException(Exception exception) {
		return ResponseEntity.of(Optional.of(Problem.builder().withTitle("User not found")
				.withDetail(exception.getMessage()).withStatus(Status.INTERNAL_SERVER_ERROR).build()));
	}
}

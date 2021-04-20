package com.zalando.demo.controller;

import java.net.URI;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.zalando.problem.Problem;
import org.zalando.problem.StatusType;
import com.zalando.demo.exception.UserException;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/users")
public class UserController {
  
  private boolean problemStacktrace = false;

  private static final String FIELD_ERRORS_KEY = "fieldErrors";

  private static final String ERROR_CODE = "error_code";

  private static final String PATH_KEY = "path";

  private static final String STACKTRACE_KEY = "stacktrace";

  private static final String METHOD_ARGUMENT_VALIDATION_ERROR_TITLE = "Method Argument Exception";
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Void> getUserById(@PathVariable final Long id) {
//		log.info("request for user id : {} ",id);
//		throw new UserException(URI.create("https://example.org/not-found"));
//	}
//	
	@GetMapping()
    public ResponseEntity<Problem> getUserById(HttpRequest request) {
        log.info("request for user id : {} ");
        Problem problem = Problem.builder()
            // .withType(ErrorConstants.CONSTRAINT_VIOLATION_TYPE)
            .withTitle("METHOD_ARGUMENT_VALIDATION_ERROR_TITLE")
            .with(ERROR_CODE, "argument.not.valid")
            .with(FIELD_ERRORS_KEY, "fieldErrors").build();
        return ResponseEntity.ok(problem);
    }
	
}

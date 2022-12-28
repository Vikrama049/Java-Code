package com.sports.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(TeachersNotFoundException.class)
	public ResponseEntity<?> coachNotFoundHandling(TeachersNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<?> TeamNotFoundHandling(CollegeNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
}

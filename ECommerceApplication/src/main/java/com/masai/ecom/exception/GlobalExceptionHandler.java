package com.masai.ecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgumentNotValidHandler(
			MethodArgumentNotValidException methodArgumentNotValidException) {
		ErrorDetails errorDetail;
		errorDetail = new ErrorDetails("Validation error",
				methodArgumentNotValidException
						.getBindingResult()
						.getFieldError()
						.getDefaultMessage());
		return new ResponseEntity<>(errorDetail, HttpStatus.BAD_REQUEST);
	}


}

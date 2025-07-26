package com.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test.payload.APIResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> handlleResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		APIResponse apiResponse = new APIResponse();
		apiResponse.setMessage(message);
		apiResponse.setSuccess(true);
		apiResponse.setStatus(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<APIResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
}

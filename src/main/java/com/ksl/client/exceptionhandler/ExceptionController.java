package com.ksl.client.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value = DuplicateEntry.class)
	public ResponseEntity<Object> exception(DuplicateEntry exception){
		return new ResponseEntity<Object>("Record is already present in the database Please enter unique record",HttpStatus.BAD_REQUEST);
	}
}

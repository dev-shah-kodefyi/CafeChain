package com.mindtree.cafe.controller.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.cafe.controller.AppRunner;
import com.mindtree.cafe.dto.ExceptionDto;
import com.mindtree.cafe.exception.ServiceException;
@RestControllerAdvice(assignableTypes= {AppRunner.class})
public class ControllerExceptionHandler {

@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ExceptionDto> serviceExceptionHandler(Exception e, Throwable cause){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDto(e.getMessage()));
	}
}

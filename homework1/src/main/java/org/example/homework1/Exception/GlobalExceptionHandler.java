package org.example.homework1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleNotFoundException(){
        return new ResponseEntity<>(
                new ExceptionResponse(888, "RESOURCE NOT FOUND"), HttpStatus.NOT_FOUND
        );
    }
}

package com.shopping.webapi.framework.handler;

import com.shopping.webapi.framework.exception.BadRequestException;
import com.shopping.webapi.framework.exception.NotFoundException;
import com.shopping.webapi.framework.model.EmptyResponsEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<EmptyResponsEntity> handlerBadRequestException(BadRequestException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new EmptyResponsEntity());
    }

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<EmptyResponsEntity> handlerNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EmptyResponsEntity());
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<EmptyResponsEntity> handlerException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new EmptyResponsEntity());
    }
}

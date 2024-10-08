package com.fraga.IncidentReporting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CPFInexistenteException.class)
    ProblemDetail handleCPFInexistenteException(CPFInexistenteException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_ACCEPTABLE, e.getLocalizedMessage());
        problemDetail.setTitle("CPF informado não cadastrado.");
        problemDetail.setDetail("Necessário informar um CPF já cadastrado.");
        problemDetail.setProperty("TimeStamp", Instant.now());

        return problemDetail;
    }
}

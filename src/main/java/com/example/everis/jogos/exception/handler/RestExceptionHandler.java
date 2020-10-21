package com.example.everis.jogos.exception.handler;

import com.example.everis.jogos.exception.JogoNotFoundException;
import com.example.everis.jogos.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(JogoNotFoundException.class)
    public ResponseEntity<?> handleResource(JogoNotFoundException notFoundException){
        ResourceNotFoundException resourceNotFoundException = ResourceNotFoundException.ResourceNotFoundExceptionBuilder.newBuilder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
//                .title("Jogo não cadastrado")
                .details(notFoundException.getMessage())
                .build();

        return new ResponseEntity<>(resourceNotFoundException, HttpStatus.NOT_FOUND);
    }

}

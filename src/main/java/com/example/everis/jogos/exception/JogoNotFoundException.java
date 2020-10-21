package com.example.everis.jogos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JogoNotFoundException extends RuntimeException{
    public JogoNotFoundException(String message){
        super(message);
    }
}

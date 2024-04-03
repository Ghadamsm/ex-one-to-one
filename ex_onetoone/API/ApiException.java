package com.example.ex_onetoone.API;


import lombok.AllArgsConstructor;
import lombok.Data;


public class ApiException extends RuntimeException {

    public ApiException(String message){
        super(message);
    }


}

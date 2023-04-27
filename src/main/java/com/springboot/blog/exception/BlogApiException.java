package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

public class BlogApiException extends RuntimeException{

    private HttpStatus status;
    private String error;

    public BlogApiException(HttpStatus status, String error) {
        this.status = status;
        this.error = error;
    }

    public BlogApiException(String message, HttpStatus status, String error) {
        super(message);
        this.status = status;
        this.error = error;
    }

    public HttpStatus getStatus(){
        return status;
    }

    public String getError(){
        return error;
    }
}

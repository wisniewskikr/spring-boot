package com.example.responses;

import org.springframework.http.HttpStatus;

public abstract class AbstractResponse {

    protected int status;
    protected String message;

    AbstractResponse(HttpStatus httpStatus, String message) {
        this.status = httpStatus.value();
        this.message = message;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}

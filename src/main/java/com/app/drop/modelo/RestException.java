package com.app.drop.modelo;

public class RestException extends RuntimeException {

    public RestException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestException(String message) {
        super(message);
    }

    public RestException(Throwable cause) {
        super(cause);
    }

}

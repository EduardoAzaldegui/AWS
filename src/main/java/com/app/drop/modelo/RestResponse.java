package com.app.drop.modelo;

import lombok.Data;

@Data
public class RestResponse {
    private int status;
    private String message;
    private long timeStamp;
}

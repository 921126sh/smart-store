package com.example.localtest.smartstoreapi.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ApiResponseEntity {
    private Date timestamp;
    private int status;
    private String error;

    private Object data;
    private String path;

    public ApiResponseEntity(int status, String error, Object message, String path) {
        this.timestamp = new Date();
        this.status = status;
        this.error = error;
        this.data = message;
        this.path = path;
    }

}


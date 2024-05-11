package com.deveci.librarymanagement.core.result;

import lombok.Getter;

@Getter
public class Result {
    private boolean status;
    private String msg;
    private String code;

    public Result(boolean status, String msg, String code) {
        this.status = status;
        this.msg = msg;
        this.code = code;
    }
}

package com.deveci.librarymanagement.core.result;

import lombok.Getter;

@Getter
public class ResultData<T> extends Result {

    private T data;

    public ResultData(boolean status, String msg, String code, T data) {
        super(status, msg, code);
        this.data = data;
    }
}

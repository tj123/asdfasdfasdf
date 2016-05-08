package com.shundian.red.lib;

public class Result<T> {

    public Result() {
    }

    public Result(boolean status) {
        this(status, "");
    }

    public Result(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    private boolean status = false;
    private String message;
    private String backpage;
    private T data;

    public Result<T> setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public Result<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result<T> ok(String message) {
        setMessage(message);
        setStatus(true);
        return this;
    }

    public Result<T> ok() {
        return ok("");
    }

    public Result<T> error(String message) {
        setMessage(message);
        setStatus(false);
        return this;
    }

    public Result<T> error() {
        return error("");
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }


}
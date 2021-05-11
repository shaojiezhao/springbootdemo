package com.example.springbootdemo.sql.vo;

public class Result<T>
{
    private int code;

    private String message;

    private T data;

    private Result(T data)
    {
        this.code = 200;
        this.message = "success";
        this.data = data;
    }

    public static <T> Result<T> success(T data)
    {
        return new Result<>(data);
    }

}

package com.itheima.day06包装类_异常.第六题;

public class ArrayLengthNotZeroException extends RuntimeException{

    public ArrayLengthNotZeroException() {
    }

    public ArrayLengthNotZeroException(String message) {
        super(message);
    }
}

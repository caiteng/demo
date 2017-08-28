package com.demo.core.exception;

/**
 * Created by Administrator on 2017-08-25.
 */
public class DemoException extends RuntimeException{

    public DemoException() {
        super();
    }

    public DemoException(String message) {
        super(message);
    }
    public DemoException(String code,String message) {
        super(message);
    }
    public DemoException(String message,Throwable cause) {
        super(message,cause);
    }
    public DemoException(Throwable cause) {
        super(cause);
    }
}

package com.github.sothnik_dev.limp_dizkits.exception.discException;

public class DiscNotFoundException extends RuntimeException {
    private final int errorCode;

    public DiscNotFoundException(String message, int errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode(){return  errorCode;}
}

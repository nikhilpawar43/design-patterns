package com.udemy.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
    
    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
    
    public enum ErrorType { GENERIC_SYSTEM_ERROR, PAGE_NOT_FOUND, SERVER_ERROR }
    
    private Map<ErrorType, ErrorMessage> errorMap = new HashMap<>();

    private ErrorMessageFactory() {
        errorMap.put(ErrorType.GENERIC_SYSTEM_ERROR, 
                new SystemErrorMessage("A generic system error with code: $errorCode occured.\nPlease review documentation at ",
                        "http://www.google.com?q="));

        errorMap.put(ErrorType.PAGE_NOT_FOUND,
                new SystemErrorMessage("A page not found error with code: $errorCode occured.\nPlease review documentation at ",
                        "http://www.google.com?q="));
    }
    
    public ErrorMessage getError(ErrorType errorType) {
        return errorMap.get(errorType);
    }
    
    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }
}

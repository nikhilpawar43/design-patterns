package com.udemy.patterns.structural.flyweight;

import com.udemy.patterns.structural.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

    public static void main(String[] args) {

        ErrorMessageFactory factory = ErrorMessageFactory.getInstance();
        
        ErrorMessage genericError = factory.getError(ErrorType.GENERIC_SYSTEM_ERROR);
        System.out.println(genericError.getText("422"));

        ErrorMessage pageNotFound = factory.getError(ErrorType.PAGE_NOT_FOUND);
        System.out.println(pageNotFound.getText("404"));
    }
}

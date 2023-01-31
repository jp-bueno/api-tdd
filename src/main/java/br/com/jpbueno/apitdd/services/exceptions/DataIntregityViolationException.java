package br.com.jpbueno.apitdd.services.exceptions;

public class DataIntregityViolationException extends RuntimeException{

    public DataIntregityViolationException(String message) {
        super(message);
    }
}

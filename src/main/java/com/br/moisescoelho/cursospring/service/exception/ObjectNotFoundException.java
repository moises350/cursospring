package com.br.moisescoelho.cursospring.service.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final Long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}

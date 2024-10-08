package com.fraga.IncidentReporting.exception;

public class CPFInexistenteException extends RuntimeException{

    public CPFInexistenteException() {
        super("CPF informado não cadastrado");
    }
}

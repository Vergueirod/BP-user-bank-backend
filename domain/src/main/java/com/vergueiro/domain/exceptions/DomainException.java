package com.vergueiro.domain.exceptions;

import java.util.List;
import com.vergueiro.domain.validation.Error;

public class DomainException extends RuntimeException {

    protected final List<Error> errors;

    protected DomainException(final List<Error> anErrors) {
        super("", null, true, false); // sem stack 3 completa -> ajuda na performance da aplicação
        this.errors = anErrors;
    }

    public static DomainException with(final List<Error> anErrors){
        return new DomainException(anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}

package com.vergueiro.domain.validation;

import java.util.List;

public interface ValidationHandler {

    // Interface fluente (encadeando chamadas de metodos)
    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    List<Error> getErrors();

    default boolean hasError(){
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation{
        void validate();
    }
}

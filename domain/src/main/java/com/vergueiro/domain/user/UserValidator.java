package com.vergueiro.domain.user;

import com.vergueiro.domain.validation.ValidationHandler;
import com.vergueiro.domain.validation.Validator;

public class UserValidator extends Validator {

    private final User user;

    public UserValidator(final User aUser, final ValidationHandler aHandler){
        super(aHandler);
        this.user = aUser;
    }

    @Override
    public void validate(){
        if (this.user.getFullName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}

package com.vergueiro.domain.user;
import com.vergueiro.domain.AggregateRoot;
import com.vergueiro.domain.validation.ValidationHandler;

import java.time.Instant;

public class User  extends AggregateRoot<UserID> {
    private String fullName;
    private String cpf;
    private String email;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private User(
            final UserID anId,
            final String aFullName,
            final String aCpf,
            final String anEmail,
            final String aPassword,
            final Instant aCreatedAt,
            final Instant anUpdatedAt,
            final Instant aDeletedAt
    ) {
        super(anId);
        this.fullName = aFullName;
        this.cpf = aCpf;
        this.email = anEmail;
        this.password = aPassword;
        this.createdAt = aCreatedAt;
        this.updatedAt = anUpdatedAt;
        this.deletedAt = aDeletedAt;
    }

    public static User newUser(
            final String aFullName,
            final String aCpf,
            final String aEmail,
            final String aPassword
    ){
        final UserID id = UserID.unique();
        final Instant now = Instant.now();
        return new User(id, aFullName, aCpf, aEmail, aPassword, now, now, null);
    }

    @Override
    public void validate(final ValidationHandler handler){
        new UserValidator(this, handler).validate();
    }

    public UserID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
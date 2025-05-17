package com.vergueiro.domain.user;

import java.time.Instant;
import java.util.UUID;

public class User {
    private String id;
    private String fullName;
    private String cpf;
    private String email;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private User(
            final String id,
            final String fullName,
            final String cpf,
            final String email,
            final String password,
            final Instant createdAt,
            final Instant updatedAt,
            final Instant deletedAt
    ) {
        this.id = id;
        this.fullName = fullName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static User newUser(
            final String aFullName,
            final String aCpf,
            final String aEmail,
            final String aPassword
    ){
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new User(id, aFullName, aCpf, aEmail, aPassword, now, now, null);
    }

    public String getId() {
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
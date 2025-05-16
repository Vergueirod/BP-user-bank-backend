package com.vergueiro_group.bp_user_bank_backend.infrastructure.persistence.entity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String fullName;
    private String cpf;
    private String email;
    private String password;

    // getters and setters
    public UUID getId() { return id;}
    public void setId(UUID id) { this.id = id;}

    public String getFullName() { return fullName;}
    public void setFullName(String fullName) { this.fullName = fullName;}

    public String getCpf() { return cpf;}
    public void setCpf(String cpf) { this.cpf = cpf;}

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password;}

}

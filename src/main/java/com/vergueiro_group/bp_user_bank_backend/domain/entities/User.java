package com.vergueiro_group.bp_user_bank_backend.domain.entities;
import com.vergueiro_group.bp_user_bank_backend.domain.valueobject.Address;
import com.vergueiro_group.bp_user_bank_backend.domain.valueobject.Telephone;

public class User {
    private String fullName;
    private String cpf;
    private String email;
    private String password;

    // Composition:
    private Telephone telephone;
    private Address address;

    // Aggregation:
    //private ClientAccount clientaccount;

    public String getFullName() { return fullName;}
    public void setFullName(String fullName) { this.fullName = fullName;}

    public String getCpf() { return cpf;}
    public void setCpf(String cpf) { this.cpf = cpf;}

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password;}
}

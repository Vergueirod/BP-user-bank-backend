package com.vergueiro_group.bp_user_bank_backend;

public class User {
    private String fullname;
    private String cpf;
    private String email;
    private String phone;
    private String password;

    public User(String fullname, String cpf, String email, String phone, String password) {
        this.fullname = fullname;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // getter and setter FullName
    public String getFullName(){
        return fullname;
    }

    public void setFullName(String fullname){
        this.fullname = fullname;
    }

    // getter and setter CPF
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    // getter and setter Email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // getter and setter Phone
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    // getter and setter Password
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}

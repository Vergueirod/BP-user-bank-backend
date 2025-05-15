package com.vergueiro_group.bp_user_bank_backend.domain.model;

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
}

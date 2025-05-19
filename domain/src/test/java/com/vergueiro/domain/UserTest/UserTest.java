package com.vergueiro.domain.UserTest;

import com.vergueiro.domain.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void givenAValidParams_whenCallNewUser_thenInstantiateAUser(){

        final String expectedFullName = "Bruno Costa";
        final String expectedCpf = "75395185200";
        final String expectedEmail = "bruno.costa@example.com";
        final String expectedPassword = "Senha@1234";

        final User actualUser =
                User.newUser(expectedFullName, expectedCpf, expectedEmail, expectedPassword);

        Assertions.assertNotNull(actualUser);
        Assertions.assertNotNull(actualUser.getId());
        Assertions.assertEquals(expectedFullName, actualUser.getFullName());
        Assertions.assertEquals(expectedCpf, actualUser.getCpf());
        Assertions.assertEquals(expectedEmail, actualUser.getEmail());
        Assertions.assertEquals(expectedPassword, actualUser.getPassword());
        Assertions.assertNotNull(actualUser.getCreatedAt());
        Assertions.assertNotNull(actualUser.getUpdatedAt());
        Assertions.assertNull(actualUser.getDeletedAt());
    }
}
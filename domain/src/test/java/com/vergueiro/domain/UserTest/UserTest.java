package com.vergueiro.domain.UserTest;

import com.vergueiro.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void givenAValidParams_whenCallNewUser_thenInstantiateAUser(){

        final var expectedFullName = "Bruno Costa";
        final var expectedCpf = "75395185200";
        final var expectedEmail = "bruno.costa@example.com";
        final var expectedPassword = "Senha@1234";

        final var actualUser =
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

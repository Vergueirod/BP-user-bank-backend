package com.vergueiro.domain.UserTest;
import com.vergueiro.domain.exceptions.DomainException;
import com.vergueiro.domain.user.User;
import com.vergueiro.domain.validation.handler.ThrowsValidationHandler;
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

    @Test
    public void givenAInvalidNullFullName_whenCallNewUserAndValidate_thenShouldReceiveError(){

        final String expectedFullName = null;
        final int expectedErrorCount = 1;
        final String expectedErrorMessage = "'name' should not be null";
        final String expectedCpf = "75395185200";
        final String expectedEmail = "bruno.costa@example.com";
        final String expectedPassword = "Senha@1234";

        final User actualUser =
                User.newUser(expectedFullName, expectedCpf, expectedEmail, expectedPassword);

        // assertThrows vai retornar a exceção
        final var actualExecption =
            Assertions.assertThrows(DomainException.class, () -> actualUser.validate(new ThrowsValidationHandler()));

        Assertions.assertEquals(expectedErrorCount, actualExecption.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualExecption.getErrors().get(0).message());
    }
}
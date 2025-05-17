package com.vergueiro.infrastructure;

import com.vergueiro.application.UseCase;
import com.vergueiro.domain.User;

public class Main {
    public static void main(String[] args) {

        System.out.println(new UseCase().execute());
    }
}
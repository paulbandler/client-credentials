package com.example;

import io.micronaut.runtime.Micronaut;

import javax.inject.Inject;


public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

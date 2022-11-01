package com.example;

import io.micronaut.runtime.Micronaut;

import javax.inject.Inject;


/**
 * Now here's an interesting little application - wonder if it will cut-muster
 * during the PR...?
 */
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

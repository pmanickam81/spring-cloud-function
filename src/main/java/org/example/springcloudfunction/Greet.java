package org.example.springcloudfunction;

import java.util.function.Function;

public class Greet implements Function<String, String> {

    @Override
    public String apply(String str) {
        return "Hello " + str + ", and welcome to Spring Cloud Function!!!";
    }
}

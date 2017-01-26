package com.codethen.interfaces.transform;

import java.util.function.Function;

public class UpperCase implements Function<String, String> {

    @Override
    public String apply(String str) {
        return str.toUpperCase();
    }
}

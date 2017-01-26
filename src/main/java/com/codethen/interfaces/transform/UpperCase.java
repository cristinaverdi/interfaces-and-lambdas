package com.codethen.interfaces.transform;

public class UpperCase implements Transformer<String, String> {

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}

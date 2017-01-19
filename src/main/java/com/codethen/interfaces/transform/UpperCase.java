package com.codethen.interfaces.transform;

public class UpperCase implements Transformer {

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}

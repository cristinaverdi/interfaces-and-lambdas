package com.codethen.interfaces.transform;

public class Twice implements Transformer {

    @Override
    public String transform(String str) {
        return str + str;
    }
}

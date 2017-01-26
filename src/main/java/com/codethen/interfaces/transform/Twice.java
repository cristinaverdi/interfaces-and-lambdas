package com.codethen.interfaces.transform;

public class Twice implements Transformer<String, String> {

    @Override
    public String transform(String str) {
        return str + str;
    }
}

package com.codethen.interfaces.transform;

public class Main {

    public static void main(String[] args) {

        UpperCase upperCase = new UpperCase();
        Twice twice = new Twice();

        System.out.println(upperCase.transform("hola"));
        System.out.println(twice.transform("hola"));

        Transformer t = (str) -> str + "!!!";
        String result = t.transform("hola");
        System.out.println(result);
    }
}

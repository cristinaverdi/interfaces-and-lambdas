package com.codethen.interfaces.transform;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        UpperCase upperCase = new UpperCase();
        Twice twice = new Twice();

        System.out.println(upperCase.transform("hola"));
        System.out.println(twice.transform("hola"));

        Transformer<String, String> t = (str) -> str + "!!!";
        String result = t.transform("hola");
        System.out.println(result);

        StringLength sl = new StringLength();
        System.out.println("Length: " + sl.transform("dog"));


        List<String> animals = Arrays.asList("dog", "cat", "fish");

        /*
        Function<? super String, Integer> function =
            new Function<String,Integer>() {
                @Override
                public Integer apply(String s) {
                    return s.length();
                }
            };
         */

        // Function<? super String, Integer> function = s -> s.length();

        List<Integer> lengths = animals.stream()
            .map(s -> s.length())
            .collect(Collectors.toList());
    }
}

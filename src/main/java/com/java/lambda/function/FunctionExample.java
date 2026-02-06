package com.java.lambda.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        //Function<String, Integer> stringLength = x -> x.length();
        Function<String, Integer> stringLength = String::length;
        int length = stringLength.apply("Hello");
        System.out.println("Length of 'Hello': " + length);


        BiFunction<Integer, Integer, String> sumToString = (str1, str2) -> "El resultado es: " + (str1 + str2);
        String result = sumToString.apply(5, 10);
        System.out.println(result);

    }
}
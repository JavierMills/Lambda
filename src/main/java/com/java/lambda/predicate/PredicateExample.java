package com.java.lambda.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        //evalua solo un parametro y devuelve un boolean
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        Boolean result = isEven.test(4);
        System.out.println("Es par? " + result);


        //evalua dos parametros y devuelve un boolean
        BiPredicate<String, Integer> checkLength = (str, length) -> str.length() == length;
        result = checkLength.test("Hola", 4);
        System.out.println("La longitud es correcta? " + result);


        }
    }
    



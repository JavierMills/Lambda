package com.java.lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // consumer se utiliza para realizar operaciones que no devuelven un resultado,
        // sino que consumen un valor y realizan una acción con él. En este ejemplo, s
        // se crea un Consumer que toma una cadena de texto y la imprime en mayúsculas.
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hola mundo");

        BiConsumer<String, Integer> repeat = (str, times) -> {
            for (int i = 0; i < times; i++) {
                System.out.println("----------------------------SE REPITE-----------------------" + str);
            }
        };


        repeat.accept("Java Lambda", 5);

    }

}

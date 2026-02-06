package com.java.lambda.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExamplesCollections {
    public static void main(String[] args) {


        //Arrays.asList, podemos cambiar elementos, es mutables, y permite valores nulos.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.forEach(System.out::println);


        Consumer<String> printWithPrefix = System.out::println;
        names.forEach(printWithPrefix);


        //ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)) -> nos da una lista inmutable, no se pueden agregar ni eliminar elementos, 
        //pero sí se pueden modificar los existentes. Permite valores nulos.
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numbers.removeIf( n -> n % 2 == 0); // Elimina los números pares
        numbers.forEach(System.out::println);

        List<String> namesList = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve"));

       namesList.replaceAll(String::toUpperCase);
       System.out.println(namesList);
        

    }
    
}

package com.java.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numberStream = numbers.stream();
        numberStream.forEach(System.out::println);

        // Stream.of -< vaalores sujetos a objetos
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream.forEach(System.out::println);

        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };
        Stream<String> namesStream = Arrays.stream(names);
        namesStream.forEach(System.out::println);

        Stream<String> namesStream2 = Stream.generate(() -> "Hola Mundo").limit(6);
        namesStream2.forEach(System.out::println);

        List<String> namesList = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        System.out.println("List of names: " + namesList);
        namesList.stream()
                .filter(name -> name.length() > 3).map(n -> n.toUpperCase())
                .forEach(System.out::println);


        Stream<String> namesStream3 = Stream.of("Alice", "Bob", "Charlie", "David", "Eve");
        // namesStream3.forEach(System.out::println);


        List<String> namesList2 = namesStream3.toList(); 
        System.out.println(namesList2); 


    }
}

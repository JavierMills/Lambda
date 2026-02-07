package com.java.lambda.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {
        // Example of using Stream API to filter and print even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberWhitStream = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()); // Collect the filtered numbers into a new list
        System.out.println("Original List: " + numbers);
        System.out.println(numberWhitStream);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");  
        List<String> namesWithStream =  names.stream()
                .filter(f -> f.startsWith("A")).toList(); // Collect the filtered names into a new list
        System.out.println("Original Names List: " + names);
        System.out.println(namesWithStream);



        //sin stream api
        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listNumberWithStream = listNumber.stream()
                .map(n -> n * n) // Map each number to its square
                .collect(Collectors.toList()); // Collect the squared numbers into a new list
        System.out.println("Original List: " + listNumber);
        System.out.println("Squared List: " + listNumberWithStream);


        //CON STREAM API
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream(); // Create a stream from the list of numbers
        Stream<Integer> squaredStream = stream.map(n -> n * n); // Map each number to its square
        List<Integer> squaredList = squaredStream.collect(Collectors.toList()); // Collect the squared numbers into a new list
        System.out.println("Original List: " + listNumber);
        System.out.println("Squared List: " + squaredList);
                   
    }

}

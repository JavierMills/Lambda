package com.java.lambda.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethodsExample {
    public static void main(String[] args) {
    
        List<String> namesList = List.of("Ana", "Luis", "Marta", "Juan", "Ana");

        List<String> longNames = namesList.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
        System.out.println("Long names: " + longNames);


          List<Integer> numbers = namesList.stream()
            .map(String::length)
            .collect(Collectors.toList());

        System.out.println("Length of names: " + numbers);

       //tenemos una lista de listas de enteros y queremos aplanarla en una sola lista de enteros. Para esto, podemos usar flatMap:
        List<List<Integer>> listOfLists = List.of(List.of(1, 2, 3),List.of(4, 5),List.of(6, 7, 8, 9));

        System.out.println("List of lists: " + listOfLists  );

        //implementamos flatMap para aplanar la lista de listas:
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)//aplanamos cada lista interna en un solo stream de enteros
                .collect(Collectors.toList());//recogemos el resultado en una lista

        System.out.println("Flattened list: " + flattenedList);



        List<Integer> nums = List.of(3, 5, 2, 8, 6, 1, 4, 7,7,7,7,7,7,7);//CREAMOS UNA LISTA DE ENTEROS DESORDENADOS
        List<Integer> sortedNumsAndUnique = nums.stream()
                .distinct()// Elimina duplicados (si los hubiera)
                .sorted() // Ordena de forma natural (ascendente)
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumsAndUnique);

        //Un Set es una colección que almacena elementos únicos sin duplicados y sin orden garantizado.
        Set<String> uniqueNames = namesList.stream()
                .filter( n -> n.length() > 3) // Filtramos nombres con más de 3 caracteres
                .collect(Collectors.toSet());
        System.out.println("Unique names with set : " + uniqueNames);


        long count = namesList.stream()
                .filter(name -> name.contains("t")) // Contamos nombres que contienen la letra "a"
                .count();
        System.out.println("Count of names with letter 't': " + count);


        int sum = nums.stream()
                .reduce(0, (result, number) -> result + number ); // Suma todos los números, comenzando con 0 como identidad

                System.out.println("Sum of numbers: " + sum);

        namesList.stream()
                .map(String::toUpperCase) // Convertimos cada nombre a mayúsculas
                .forEach(System.out::println); // Imprimimos cada nombre en mayúsculas  


    }

  
    
}

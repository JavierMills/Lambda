package com.java.lambda.record;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Product product = new Product("Laptop", 999.99);
        // product.getName();

        // ProductDTO productDTO = new ProductDTO("Smartphone", 499.99);
        // productDTO.name();
        // productDTO.price();
        // productDTO.toString();

        List<ProductDTO> products = List.of(
                new ProductDTO("Laptop", 999.99),
                new ProductDTO("Smartphone", 499.99),
                new ProductDTO("Tablet", 299.99),
                new ProductDTO("Tablet", 299.99));

        System.out.println(products);

        List<String> productNames = products.stream()
                .map(productDTO -> new ProductDTO(productDTO.name(), productDTO.price() * 0.9))
                // Por qué el segundo map()? Porque quiere convertir cada ProductDTO en un
                // String formateado "Laptop: 899.99"
                // para mostrar en consola de forma legible. Es una transformación de tipo:
                // ProductDTO → String.
                .map(productDTO -> String.format("%s: $%.2f", productDTO.name(), productDTO.price()))
                .toList();

        System.out.println("Productos con descuento: " + productNames);

        Map<String, List<ProductDTO>> byPriceRange = products.stream()
                .collect(Collectors.groupingBy(
                        productDTO -> productDTO.price() < 500 ? "Caro" : "Barato"));

        System.out.println("Productos agrupados por rango de precio: " + byPriceRange);

        Map<String, Long> countByRange = products.stream()
                .collect(Collectors.groupingBy(
                        productDTO -> productDTO.price() < 500 ? "Caro" : "Barato",
                        Collectors.counting()));

        System.out.println("Conteo de productos por rango de precio: " + countByRange);

        // reduccion matematica

        Double totalPrice = products.stream()
                .map(productDTO -> productDTO.price()) // Extrae el precio de cada producto
                .reduce(0.0, (sum, price) -> sum + price); // Suma todos los precios, comenzando desde 0.0

        System.out.println("Precio total de los productos: " + totalPrice);

        String productSumary = products.stream()
                .map(p -> p.name() + " ( " + p.price() + " ) ") // Extrae el nombre de cada producto y lo concatena con
                                                                // su precio
                .reduce("", (s1, s2) -> s1.isEmpty() ? s2 : s1 + " | " + s2);

        // Concatena todos los nombres en una sola cadena, separándolos por comas
        System.out.println("Resumen de productos: " + productSumary);



        // Conversion entre coleciones.


        Set<Double> priceSet = products.stream()
                .map(productDTO -> productDTO.price()) // Extrae el precio de cada producto
                .collect(Collectors.toSet()); // Recopila los precios en un Set para eliminar duplicados
        System.out.println("Conjunto de precios: " + priceSet);



        // Map<String, Double> productMap = products.stream()
        //         .collect(Collectors.toMap(
        //                 productDTO -> productDTO.name(), // Clave: el nombre del producto
        //                 productDTO -> productDTO.price(); // Valor: el precio del producto
        // System.out.println("Mapa de productos: " + productMap);



         Map<String, Double> productMapLambda = products.stream()
                .collect(Collectors.toMap(
                        ProductDTO::name, // Clave: el nombre del producto
                        ProductDTO::price, // Valor: el precio del producto
                        (old, newVal) -> old)); // En caso de clave duplicada, se mantiene el valor antiguo

        System.out.println("Mapa de productos: " + productMapLambda);


        List<ProductDTO> productList = productMapLambda.entrySet().stream()
                .filter(e -> e.getValue() > 300)
                 // Filtra las entradas del mapa por precio mayor a 300
                .map(e -> new ProductDTO(e.getKey(), e.getValue())) // Convierte cada entrada del mapa en un ProductDTO
                .collect(Collectors.toList()); // Recopila los productos en una nueva lista
        System.out.println("Lista de productos con precio mayor a 300: " + productList);



    }

}

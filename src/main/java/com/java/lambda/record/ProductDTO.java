package com.java.lambda.record;

import java.util.Objects;

public record ProductDTO(String name, double price) {

    public static String ATRIBUTO = "Valor de atributo estático";

    public ProductDTO {
        Objects.requireNonNull(name, "El nombre no puede ser nulo");
    }
   
    public ProductDTO(String name) {
        this(name, 0.0);
    }   

    
}

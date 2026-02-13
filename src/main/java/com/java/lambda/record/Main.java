package com.java.lambda.record;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99);
        product.getName();

        ProductDTO productDTO = new ProductDTO("Smartphone", 499.99);
        productDTO.name();  
        productDTO.price();
        productDTO.toString();
      

    }

}

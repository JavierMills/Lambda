package com.java.lambda.function;

public class HigherOrderExample {

   

    public static void main(String[] args) {

        // Usando la función de orden superior con una operación de suma
        int sumResult = applyOperation(5, 3, (a, b) -> a + b);
        System.out.println("Sum Result: " + sumResult);

    
      
    }

     // Función que recibe 2 parametros y toma otra función como parámetro
    public static int applyOperation(int a, int b, Operation operation) {
        int result = operation.operate(a, b);
        return result;
    }

    @FunctionalInterface
    public interface Operation {
        int operate(int a, int b);
    }
    
}

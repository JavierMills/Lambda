package com.java.lambda;

public class Main {
    public static void main(String[] args) {


       // esto es una clase aninima que implementa la interfaz Operation
       //con el new implementamos la interfaz al vuelo
        Operation operation = new Operation() {

            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Result: " + operation.operate(5, 3));


        Operation multiply = (a, b) -> a * b; // esto es una expresión lambda que implementa la interfaz Operation
        System.out.println("Multiplication Result: " + multiply.operate(5, 3));

        Operation subtract = (a, b) -> a - b; // otra expresión lambda que resta
        System.out.println("Subtraction Result: " + subtract.operate(5, 3));
    }


    //le decimos que esta interfaz es funcional, es decir, tiene un solo método abstracto
@FunctionalInterface
    public interface Operation {
    
        int operate(int a, int b);

        default String show() {
            return "Soy un metodo por default .";
        }


        static Operation substracion(){
            return (a,b) -> a - b;
        }
        
    }
}
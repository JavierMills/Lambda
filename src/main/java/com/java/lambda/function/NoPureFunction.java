package com.java.lambda.function;



public class NoPureFunction {
     
     static int counter = 0; //estado compartido

    public static int incrementCounter(int valor) {
        counter += valor; //modifica el estado global
        return counter;
    }

    public static void main(String[] args) {

        int result1 = incrementCounter(5);
        System.out.println("Result after incrementing by 5: " + result1);

        int result2 = incrementCounter(3);
        System.out.println("Result after incrementing by 3: " + result2);


    
     
    }


    
}

package com.java.lambda.function;

import java.util.function.Function;

public class PureFunction {

    public static int multiplyByTwo(int number) {
        return number * 2;
    }

    public static void main(String[] args) {

        int result = multiplyByTwo(5);
        System.out.println("Result: " + result);


        //i al metodo functionalProgramming no le ponemos el static tenemos que crear un objeto de la clase PureFunction
        PureFunction pf = new PureFunction();        
        pf.functionalProgramming();

    }

    public void functionalProgramming() {

        //lleva dos parametros(Integer, Integer): el tipo de entrada y el tipo de salida
        Function<Integer, Integer> increment = (value) -> value * 2;

        int result = increment.apply(5);
        System.out.println("Functional Programming Result: " + result);

    }

}

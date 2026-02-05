package com.java.lambda.task;

public class Calculator {


    public void operateAndPrint(int a, int b, Operation operation) {
        int result = operation.operate(a, b);
        System.out.println("Operation Result: " + result);
    }

    public static void main(String[] args) {

        //tenemos que hacer la instancia por que ni es un metodo static
        Calculator calculator = new Calculator();

        calculator.operateAndPrint(10, 5, (x, y) -> x + y);
        calculator.operateAndPrint(10, 5, (x, y) -> x - y);
        calculator.operateAndPrint(10, 5, (x, y) -> x * y);     
        calculator.operateAndPrint(10, 5, (x, y) -> x / y);


    }

}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);

}
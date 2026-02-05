package com.java.lambda.function;


public class ReferentialTransparency {

    public static int triple(int a) {
        return a * 3;
    }

    public static void main(String[] args) {

        
        int result =triple(4);
        int result2 = 9 + 2;

        System.out.println("Result: " + result);    
        System.out.println("Result2: " + result2);
 
    }
    
}

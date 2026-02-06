package com.java.lambda.supplier;

import java.util.function.Supplier;

public class SuppierExample {
     public static void main(String[] args) {
         //supplier no recibe parametros y retorna un valor
    Supplier<Person> personSupplier = () -> new Person("Javier Mills");
    Person p = personSupplier.get(); //retorna un nuevo objeto de tipo Person con el nombre "Javier Mills"
    System.out.println(p); //imprime el objeto Person creado

     }

  



    
}

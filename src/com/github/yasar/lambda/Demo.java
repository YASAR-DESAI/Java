package com.github.yasar.lambda;

import java.sql.SQLOutput;

@FunctionalInterface
interface Print<T>{

    public String printObject (T object);

}

public class Demo {

    public static void main(String[] args) {

        Print printObj = (obj) -> (obj.toString());

        System.out.println(printObj.printObject("This is me!!"));


    }
}

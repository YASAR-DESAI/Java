package com.github.yasar.lambda;

interface functionalInterface<T>{

    public T returnType(T t);

}


public class LambdaDemo {

    public static void main(String[] args) {

        functionalInterface fi = (obj) -> obj.getClass();

        System.out.println(fi.returnType(4.5123));

    }


}

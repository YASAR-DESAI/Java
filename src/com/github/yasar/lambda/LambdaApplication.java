package com.github.yasar.lambda;

@FunctionalInterface
interface myInterface{

    public int getLength(String string);

}


public class LambdaApplication {

    public static void main(String[] args) {

        myInterface lambda = (s) ->  s.length();

        System.out.println(lambda.getLength("Yasar"));

    }

}

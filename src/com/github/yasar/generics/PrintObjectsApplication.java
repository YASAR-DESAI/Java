package com.github.yasar.generics;

public class PrintObjectsApplication {

    public static void main(String[] args) {


        PrintObjects<Integer> print = new PrintObjects<>(3);
        print.print();

        PrintObjects<String> printString = new PrintObjects<>("Hello There!");
        printString.print();

    }

}

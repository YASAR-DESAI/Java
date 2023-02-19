package com.github.yasar.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMainClass {

    public static void main(String[] args) {

        MusicArtists musicArtist = new MusicArtists();
        DisplayInfo<MusicArtists> displayInfo  = new DisplayInfo<>(musicArtist);
        displayInfo.printInfo();

        Actors actor = new Actors();
        DisplayInfo<Actors> displayInfo1 = new DisplayInfo<>(actor);
        displayInfo1.printInfo();

        genericPrint(actor);
        genericPrint(actor, musicArtist);
        System.out.println(genericReturn(actor));

        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("Stella"));
        list.add(new Cat("Mr. Pumpkin"));

        printList(list);


    }

    public static <T> void genericPrint(T objectToPrint){
        System.out.println(objectToPrint+"!!!");
    }

    //Printing 2 objects using generics;
    public static <T, V> void genericPrint(T objectToPrint, V otherThing ) {
        System.out.println(objectToPrint + "!!!");
        System.out.println(otherThing + "!!!");
    }

    public static <T, V> T genericReturn(T objectToPrint ) {
        System.out.println(objectToPrint + "!!!");
        return objectToPrint;
    }

    //using Wildcards
    public static void printList(List<?> list){
        System.out.println(list);
    }

}

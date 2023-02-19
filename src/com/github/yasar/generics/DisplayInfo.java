package com.github.yasar.generics;

public class DisplayInfo<T extends Artists> {

    T artist;

    public DisplayInfo(T artist) {
        this.artist = artist;
    }


    public void printInfo(){
        artist.printWealth();
        System.out.println(artist.toString());
    }



}

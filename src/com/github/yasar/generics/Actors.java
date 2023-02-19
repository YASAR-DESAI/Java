package com.github.yasar.generics;

public class Actors extends Artists{

    String formOfArt = "Making visual art";
    String artistExample = "Christian Bale" ;

    @Override
    public String toString() {
        return "Actors{" +
                "formOfArt='" + formOfArt + '\'' +
                ", artistExample='" + artistExample + '\'' +
                '}';
    }
}

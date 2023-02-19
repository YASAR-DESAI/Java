package com.github.yasar.generics;

public class MusicArtists extends Artists{

    String formOfArt = "Making music";
    String artistExample = "TheWeeknd" ;

    @Override
    public String toString() {
        return "MusicArtists{" +
                "formOfArt='" + formOfArt + '\'' +
                ", artistExample='" + artistExample + '\'' +
                '}';
    }
}

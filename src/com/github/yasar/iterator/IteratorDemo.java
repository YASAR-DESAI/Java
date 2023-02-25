package com.github.yasar.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Sweden");
        countries.add("Denmark");
        countries.add("France");

        Iterator iterator = countries.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("After Deleting one country:");

        Iterator iterator2 = countries.iterator();

        while (iterator2.hasNext()) {
            if(iterator2.next().equals("Denmark")){
                iterator2.remove();
            }
        }

        System.out.println(countries);

    }
}

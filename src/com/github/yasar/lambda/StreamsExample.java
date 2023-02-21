package com.github.yasar.lambda;

import java.util.*;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamsExample {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));


        productsList.stream().map(p -> p.price*2).forEach(p -> System.out.println(p));

        productsList.stream().filter(p -> p.name.equals("Lenevo Laptop")).forEach(p -> System.out.println(p.toString()));


    }
}

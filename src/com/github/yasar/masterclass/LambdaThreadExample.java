package com.github.yasar.masterclass;

import java.util.*;

public class LambdaThreadExample {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("This is a thread!");
        };

        new Thread(runnable).start();

        //Instead of passing runnable ref. we pass the lamda expression directly.
        new Thread(() -> {
            System.out.println("This is the second thread!!");
            System.out.println("Second message from 2nd thread.");
        }).start();

        Employee john = new Employee(343, "John");
        Employee max = new Employee(341, "Max");
        Employee philip = new Employee(23, "Philip");

        List<Employee> list = new ArrayList<>();
        list.add(john);
        list.add(max);
        list.add(philip);

        List<String> list2 = new ArrayList<>();
        list2.add("john");
        list2.add("max");
        list2.add("philip");

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getName().compareTo(emp2.getName());
            }
        });


        Collections.sort(list2);


        for (Employee emp :  list       ) {
            System.out.println(emp.getName());
        }



    }
}

class Employee{

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
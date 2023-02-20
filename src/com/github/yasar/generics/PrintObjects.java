package com.github.yasar.generics;

public class PrintObjects<T> {

    T object ;

    public PrintObjects(T object){
        this.object = object;
    }



    @Override
    public String toString() {
        return "PrintObjects{" +
                "object=" + object +
                '}';
    }

    public void print(){
        System.out.println("The object is :"+ object.toString());
    }


}

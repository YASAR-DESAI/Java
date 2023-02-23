package com.github.yasar.masterclass;

interface myClass{

    public String concat(String s1, String s2);

}

public class LambdaExample2 {

    public static void main(String[] args) {

        myClass ref = (s1, s2) -> s1+s2;

            String result = concatCaller( ref,"StringOne", "StringTwo");
            System.out.println(result);

    }

    public static String concatCaller(myClass mc , String s1 , String s2){

        return mc.concat(s1,s2);

    }

}

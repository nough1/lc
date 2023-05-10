package com.nou.design.pattern.singleton.flyweight;

public class FlyWeight {

    public static void main(String[] args) {


        Integer a= Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        System.out.println(a==b);

        Integer c= Integer.valueOf(129);
        Integer d = Integer.valueOf(129);
        System.out.println(c==d);
    }
}

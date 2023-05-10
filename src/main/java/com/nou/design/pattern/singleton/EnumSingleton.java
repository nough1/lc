package com.nou.design.pattern.singleton;

public class EnumSingleton {

    public static void main(String[] args) {

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum1==singletonEnum2);

        singletonEnum2.sayOk();

    }

}

enum SingletonEnum {

    INSTANCE;

    public void sayOk(){

        System.out.println("hello");

    }
}

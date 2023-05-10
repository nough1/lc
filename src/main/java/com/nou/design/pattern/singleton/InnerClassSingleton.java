package com.nou.design.pattern.singleton;

public class InnerClassSingleton {

    private static  class InnerClass{

        private static final InnerClassSingleton singleton = new InnerClassSingleton();

    }

    public static InnerClassSingleton getInstance(){

        return InnerClass.singleton;

    }
}

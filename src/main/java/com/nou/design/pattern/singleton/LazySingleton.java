package com.nou.design.pattern.singleton;

public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){


    }

    public static LazySingleton getInstance(){


        if(singleton==null){

            synchronized (LazySingleton.class){

                if(singleton==null){

                    singleton = new LazySingleton();

                }

            }

        }

        return singleton;
    }

    
    public static synchronized LazySingleton syncGetInstance(){

        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}

package com.nou.test.sort;


import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static void main(String[] args) {

        testSort();

    }


    public static void testSort(){

        int size = 10000;
        String[] data = new String[size];
        Random random = new Random();

        for(int i=0;i<size;i++){

            data[i]=(String.valueOf(random.nextInt(100000)));
        }

        long startTime = System.currentTimeMillis();
        Arrays.sort(data);
        System.out.println("elapse time:"+(System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        Arrays.parallelSort(data);
        System.out.println("elapse time:"+(System.currentTimeMillis()-startTime));

    }
}

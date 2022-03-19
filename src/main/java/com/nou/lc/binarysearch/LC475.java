package com.nou.lc.binarysearch;

import java.util.Arrays;

public class LC475 {

    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;

        for(int house:houses){

            int index = Arrays.binarySearch(heaters,house);
            System.out.println("index:"+index);
            if(index<0){
                index = -(index+1);
            }
            int leftDistance = index>=1?house-heaters[index-1]:Integer.MAX_VALUE;
            int rightDistance = index<heaters.length?heaters[index]-house:Integer.MAX_VALUE;
            result = Math.max(result,Math.min(leftDistance,rightDistance));

        }
        return result;
    }
}

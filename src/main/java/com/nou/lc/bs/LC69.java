package com.nou.lc.bs;

public class LC69 {

    public int mySqrt(int x) {

        int l=0,r=x;
        while (l<r){

            int mid = l+((r-l)>>2);
            if(mid<=x/mid){
                l=mid;
            }else{
                r=mid-1;
            }

        }
        return r;

    }

    public static void main(String[] args) {
        System.out.println((8-2)>>1);
    }
}

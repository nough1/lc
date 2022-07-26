package com.nou.lc.math;

/**
 * https://leetcode.com/problems/powx-n/discuss/19546/Short-and-easy-to-understand-solution
 * https://www.youtube.com/watch?v=g9YQyYi4IQQ
 * 用递归的思路可以将复杂度从 o(n) 转化为 ologn
 */
public class LC50 {

    public double myPow(double x, int n) {

        double result = helper(x,Math.abs(n));

        if(n<0){
            return 1/result;
        }

        return result;

    }

    public double helper(double x,int n){

        if(n==0)return  1;
        if(x==0)return 0;

        double result = helper(x,n/2);
        if(n%2==0) return result*result;
        return result*result*x;
    }

    public double myPow1(double x, int n) {

        // 注意三种 case 的处理 , n=0,n>0,n<0;
        // 另外下面的这种解法会出现 tle .
        double result = 1d;
        if(n==0){
            return 1;
        }
        int m = n;
        if(n<0){
            m = -n;
        }
        for(int i=1;i<=m;i++){
            result*=x;
        }
        if(n<0){
            return 1/result;
        }else{
            return result ;
        }
    }
}

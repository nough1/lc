package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/decode-ways/
 * https://www.youtube.com/watch?v=qli-JCrSwuk
 * 这个视频的讲解不错，深入浅出
 */
public class LC91 {

    public int numDecodings(String s) {

        Integer[] memo = new Integer[s.length()+1];
        return helper(s,0,memo);

    }

    public int helper(String s,int start,Integer[] memo){

        // base case 1 : reach the end
        if(start>=s.length()){
            return 1;
        }
        // bad case 2 :
        if(s.charAt(start)=='0'){
            return 0;
        }
        if(memo[start]!=null){
            return memo[start];
        }
        int result = helper(s,start+1,memo);
        // 这里的边界细节处理有点问题
        if(start+2<=s.length() && Integer.valueOf(s.substring(start,start+2))<=26){
            result+=helper(s,start+2,memo);
        }
        memo[start] = result;
        return result;
    }
}

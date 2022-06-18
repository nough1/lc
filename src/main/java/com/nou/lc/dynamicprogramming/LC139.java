package com.nou.lc.dynamicprogramming;

import java.util.List;

/**
 * https://leetcode.com/problems/word-break/discuss/43790/Java-implementation-using-DP-in-two-ways
 * https://www.youtube.com/watch?v=Sx9NNgInc3A
 */
public class LC139 {

    public boolean wordBreak(String s, List<String> wordDict) {

        // dp 思路 ，从最后面开始分析
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;i--){

            for(String word:wordDict){

                /**
                 * <= 还是 < 这个细节要思考清楚
                 */
                if(i+word.length()<=s.length() && s.substring(i,i+word.length()).equals(word)){

                    /**
                     * 这个 dp 公式要想清楚
                     */
                    dp[i] = dp[i+word.length()] ;
                    if(dp[i]){
                        break;
                    }
                }
            }

        }

        return dp[0];

    }
}

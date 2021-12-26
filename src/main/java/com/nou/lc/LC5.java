package com.nou.lc;

/**
 * 最长回文子串
 */
public class LC5 {

    /**
     * 最长回文子串
     * 思路 : 分为偶数跟奇数
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        String result = "";
        if(s.length()==0){
            return result;
        }
        for(int i=0;i<s.length();i++){

            // 计算以 i 为中心的奇数回文
            int l=i-1,r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(r-l-1>result.length()){
                result = s.substring(l+1,r);
            }

            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(r-l-1>result.length()){
                result = s.substring(l+1,r);
            }


        }

        return result;
    }

}

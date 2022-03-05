package com.nou.lc.math;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 * zigzag conversation
 * tag : math 找规律
 */
public class LC6 {

    // 注意点 , j=i 而不是 =0 , 第二是 k 的起始判断 ,
    public String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();
        if(numRows==1){
            return s;
        }
        // 规律 2n -2 等差数列

        for(int i=0;i<numRows;i++){

            if(i==0||i==numRows-1){

                for(int j=i;j<s.length();j+=2*numRows-2){
                    sb.append(s.charAt(j));
                }

            }else{


                for(int j=i,k=2*numRows-2-i;j<s.length() || k<s.length();j+=2*numRows-2,k+=2*numRows-2){
                    if(j<s.length())sb.append(s.charAt(j));
                    if(k<s.length())sb.append(s.charAt(k));
                }
            }

        }
        return sb.toString();
    }
}

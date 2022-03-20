package com.nou.lc.math;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/multiply-strings/
 *
 *
 */
public class LC43 {

    public String multiply(String num1, String num2) {

        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        char[] result = new char[num1.length()+num2.length()];

        Arrays.fill(result,'0');

        char[] num1CharArray = num1.toCharArray();
        char[] num2CharArray = num2.toCharArray();

        for(int i=num1.length()-1;i>=0;i--)
            for(int j=num2.length()-1;j>=0;j--){

                // 这里是关键
                int product = (num1CharArray[i]-'0')*(num2CharArray[j]-'0');

                // 这里 i+j+1 需要思考
                int tmp = result[i+j+1] -'0'+product;

                // 这里的转换加 '0' 需要注意 .
                result[i+j+1] = (char)(tmp%10+'0');
                result[i+j]=(char)((result[i+j]-'0'+tmp/10)+'0');
            }
        StringBuilder sb = new StringBuilder();
        boolean prefixZero = true;
        for(char character:result){

            if(character=='0' && prefixZero){
                continue;
            }else{
                prefixZero = false;
                sb.append(character);
            }
        }
        return sb.toString();
    }
}

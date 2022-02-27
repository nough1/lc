package com.nou.lc;

/**
 * add digits
 * https://leetcode.com/problems/add-digits/
 * 思路: 考察编程，主要的做法是要分层，分方法写，让每一个小函数足够简单，这样不容易
 * 出错
 */
public class LC258 {

    public int addDigits(int num) {

       int result = addDigitsOnce(num);
       while (result>9){
           result = addDigitsOnce(result);
       }
       return result;
    }

    /**
     * 模式解法
     * @param num
     * @return
     */
    public int addDigitsByPattern(int num) {

        if(num==0){
            return num;
        }else if(num%9==0){
            return 9;
        }else {
            return num%9;
        }

    }

    /**
     * 循环解法
     * @param num
     * @return
     */
    public int addDigitsOnce(int num){

        int result =0;
        while (num !=0){

            int mod = num%10;
            result+=mod;
            num = num/10;

        }
        return result;
    }
}

package com.nou.lc.math;

/**
 * https://leetcode.com/problems/palindrome-number/
 * palindrome
 */
public class LC9 {

    public boolean isPalindrome(int x) {

        boolean isPalindrome=false;
        if(x<0){
            return isPalindrome;
        }
        Long revertX = 0l;
        int originalX = x;
        while (x!=0){

            int digit = x%10;

            revertX = revertX*10+digit;

            x=x/10;
        }
        return originalX==revertX;
    }
}

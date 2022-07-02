package com.nou.lc.twopointers;

/**
 * 刚开始没有想到是双指针的思路，
 * 而是两个字符串两个方向比较
 * https://leetcode.cn/problems/valid-palindrome/
 * 思路知道后简单，但是实际上写的时候碰到两个困难，一个容易发现
 * if else 分之错误 , 另一个忽略大小写的条件忘记了，难发现
 */
public class LC125 {



    public boolean isPalindrome(String s) {

        if(s.isEmpty()){
            return true;
        }

        int left = 0, right = s.length()-1;
        while (left<right){


            char lc = s.charAt(left);
            char rc = s.charAt(right);

            if(!Character.isLetterOrDigit(lc)){
                left++;
            }else if(!Character.isLetterOrDigit(rc)){
                right--;
            }else {
                if(Character.toLowerCase(lc)!=Character.toLowerCase(rc)){
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }
}

package com.nou.lc.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 * 一下子没有想到思路 , 但是先从计算 squareNum 一步
 * 一步的做就可以拼出整个
 */
public class LC202 {

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {

            // 计算出 n 的 squareNum
            set.add(n);

            int squareNum = 0;
            while (n > 0) {

                int mod = n % 10;

                squareNum += mod * mod;

                n /= 10;

            }
            if (squareNum == 1) {
                return true;
            } else {
                n = squareNum;

            }
        }
        return false;
    }


}

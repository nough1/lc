package com.nou.lc.hashtable;

import java.util.*;

/**
 * 2022-11-23
 * https://leetcode.com/problems/happy-number/?envType=study-plan&id=level-2
 *
 */
public class LC202_1 {

    private Map<Integer,Integer> digitSquareMap = new HashMap<>();

    public boolean isHappy(int n) {

        if(n==1){
            return true;
        }
        int temp = n;
        Set<Integer> calculatedNums = new HashSet<>();
        while (temp!=1){

            if(calculatedNums.contains(temp)){
                return false;
            }
            calculatedNums.add(temp);

            List<Integer> digits = getDigits(temp);

            // 这里有 bug ， 忘记重新设置 temp .
            temp = 0 ;
            for(int i=0;i<digits.size();i++){

                temp += calSquares(digits.get(i));

            }

        }
        return true;
    }

    public Integer calSquares(int digit){

        int result = 0;
        try {
            if (digitSquareMap.containsKey(digit)) {
                return digitSquareMap.get(digit);
            }
            result = digit * digit;
            digitSquareMap.put(digit, result);
        }finally {
            System.out.println("digit "+digit+",square:"+result);
        }
        return result;

    }

    /**
     * 计算每个数字
     * @param n
     * @return
     */
    public List<Integer> getDigits(int n){

        int temp = n;
        List<Integer> digits = new ArrayList<>();

        while (n!=0){
            digits.add(n%10);
            n/=10;
        }
        // 这里打印有问题，因为n是变化的，跟入参的值不一样
        System.out.println("n "+temp+",digits:"+digits);
        return digits;
    }

}

package com.nou.lc.math;

import java.util.HashMap;
import java.util.Map;

public class LC13 {

    public int romanToInt(String s) {

            Map<Character,Integer> romanToNumerMap = new HashMap<>();
            romanToNumerMap.put('I',1);
            romanToNumerMap.put('V',5);
            romanToNumerMap.put('X',10);
            romanToNumerMap.put('L',50);
            romanToNumerMap.put('C',100);
            romanToNumerMap.put('D',500);
            romanToNumerMap.put('M',1000);

            int result = 0;
            for(int i=0;i<s.length();i++){

                if((i+1)<s.length() && romanToNumerMap.get(s.charAt(i+1))>romanToNumerMap.get(s.charAt(i))){

                    result-=romanToNumerMap.get(s.charAt(i));
                }else{

                    result+=romanToNumerMap.get(s.charAt(i));
                }

            }
            return result;
    }
}

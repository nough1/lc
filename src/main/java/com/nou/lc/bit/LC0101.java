package com.nou.lc.bit;


/**
 * https://leetcode-cn.com/problems/is-unique-lcci/
 * bit
 */
public class LC0101 {

    public boolean isUnique(String astr) {

        int mark = 0;
        for(Character character:astr.toCharArray()){

            int offset = character-'a';
            int value = 1<<offset;
            if((mark & value) !=0){
                return false;
            }else{
                mark = mark|value;
            }
        }
        return true;
    }
}

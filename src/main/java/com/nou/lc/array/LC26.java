package com.nou.lc.array;

/**
 * 删除有序数组中的重复元素
 */
public class LC26 {

    public int removeDuplicates(int[] nums) {

        int k=0;
        for(int i=0;i<nums.length;i++){


            if(i==0 || nums[i]!=nums[i-1]){
                nums[k++] = nums[i];
            }

        }
        return k;
    }
}

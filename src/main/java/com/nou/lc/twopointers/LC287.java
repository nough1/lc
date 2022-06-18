package com.nou.lc.twopointers;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/discuss/1892921/Java-9-Approaches-Count-%2B-Hash-%2B-Sort-%2B-Binary-Search-%2B-Bit-%2B-Fast-Slow-Pointers
 * 很巧妙的问题转换 , 转换为 link list cycle 问题
 */
public class LC287 {

    public int findDuplicate(int[] nums) {

        int slow=0,fast=0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow!=fast);

        slow = 0;

        do{
            slow = nums[slow];
            fast = nums[fast];

        }while (slow!=fast);

        return slow;
    }
}

package com.nou.lc.binarysearch;

/**
 * 这个视频讲解的效果不错，把几种 case 都讲了下
 * https://www.youtube.com/watch?v=oTfPJKGEHcc
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class LC33 {

    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // should notice the equal condition
            if (nums[mid] >= nums[left]) {

                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {

                if (target <= nums[right] && target >= nums[mid]) {

                    left = mid + 1;

                } else {
                    right = mid - 1;
                }

            }


        }
        return -1;
    }
}

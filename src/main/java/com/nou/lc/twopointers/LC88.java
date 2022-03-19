package com.nou.lc.twopointers;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 *
 */
public class LC88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=0 ,p2=0;

        int[] result = new int[m+n];
        int p3 = 0;
        while (p1<m && p2<n){

            if(nums1[p1]>nums2[p2]){
                result[p3] = nums2[p2];
                p2++;
            }else {
                result[p3] = nums1[p1];
                p1++;
            }
            p3++;
        }

       while (p1<m){

           result[p3++] = nums1[p1++];

       }
        while (p2<n){

            result[p3++] = nums2[p2++];

        }
        for(int i=0;i<m+n;i++){
            nums1[i] = result[i];
        }
        return;
    }
}

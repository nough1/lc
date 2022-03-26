
package com.nou.lc.sort;

/**
 * https://leetcode.com/problems/sort-an-array/
 */
public class LC912 {

    public int[] sortArray(int[] nums) {

        quicksort(nums,0,nums.length-1);
        return nums ;

    }

    public void quicksort(int[] nums,int low,int high){



        if(low>=high){
            return;
        }

        // 1. partitioning

        int pivotIndex = partition(nums,low,high);


        // 2. recursively quicksort for sub array

        quicksort(nums,low,pivotIndex-1);
        quicksort(nums,pivotIndex+1,high);

    }


    public int partition(int[] nums,int low,int high){

        int pivot = nums[high];
        // 注意，这里需要新定义左右两个指针，要不然会出错，不能直接使用 low ,high
        int lp = low;
        int rp = high;
        while (lp<rp){

            while (nums[lp]<=pivot && lp<rp){
                lp++;
            }
            while (nums[rp]>=pivot && lp<rp){
                rp--;
            }

            swap(nums,lp,rp);

        }

        swap(nums,lp,high);

        return lp;

    }


    public void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

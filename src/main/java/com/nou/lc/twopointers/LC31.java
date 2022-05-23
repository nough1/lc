package com.nou.lc.twopointers;

/**
 * https://www.youtube.com/watch?v=quAS1iydq7U
 * https://leetcode.com/problems/next-permutation/
 * https://leetcode.com/problems/next-permutation/discuss/13994/Readable-code-without-confusing-ij-and-with-explanation
 */
public class LC31 {

    public void nextPermutation(int[] nums) {


        // first find the

        int pivot = findTheFirstPeak(nums)-1;

        if(pivot!=-1){


            int rightIndex = findRightMostSuccessor(nums,nums[pivot]);

            swap(nums,pivot,rightIndex);


        }

        reverseSuffix(nums,pivot+1);

    }


    public int findTheFirstPeak(int[] nums){

        for(int i=nums.length-1;i>0;i--){

            if(nums[i]>nums[i-1]){
                return i;
            }
        }

        return 0;

    }


    public int findRightMostSuccessor(int[] nums,int pivot){


        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]>pivot){
                return i;
            }

        }

        return -1;
    }

    public void reverseSuffix(int[] nums,int start){

        int end = nums.length-1;
        while (start<end){

            swap(nums,start++,end--);

        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

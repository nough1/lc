package com.nou.lc.binarysearch;

public class LC34 {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0]=binarysearch(nums,target,true);
        result[1]=binarysearch(nums,target,false);
        return result;
    }

    public int binarysearch(int[] nums,int target,boolean isLeft){

        int low=0,high = nums.length-1;
        int i = -1;
        while (low<=high){

            int mid = low+(high-low)/2;

            if(target==nums[mid]){
                i = mid ;
                if(isLeft){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(nums[mid]>target){

                high = mid-1;

            }else{

                low = mid+1;
            }

        }
        return i;
    }
}

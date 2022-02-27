package com.nou.lc.array;


/**
 * First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * 考察 hash set 的另外一种实现
 */
public class LC41 {


    public int firstMissingPositive(int[] nums) {

        // 将负数变为 0
        for(int i=0;i<nums.length;i++){

            if(nums[i]<0){
                nums[i] = 0;
            }

        }



        // 标记是否存在

        for(int i=0;i<nums.length;i++){

            // 下面这一行要加绝对值 , 要不然后面的有一些值会遍历不到 .
            int index = Math.abs(nums[i]);

            if(index>=1 && index<=nums.length){

                if(nums[index-1]>0){


                    nums[index-1] = 0-nums[index-1];

                    // 下面这一行要加,因为有些定位到这个位置  .
                }else if(nums[index-1]==0){

                    nums[index-1] = 0-(nums.length+1);
                }
            }


        }
        for(int i=1;i<=nums.length;i++){

            if(nums[i-1]>=0){
                return i;
            }
        }

        return nums.length+1;
    }

}

package com.nou.lc.binarysearch;

/**
 * https://leetcode-cn.com/problems/first-bad-version/
 */
public class LC278 extends VersionControl {

    public int firstBadVersion(int n) {

        int low= 1 ,high = n;


        while (low<=high){

            // 右移的那个会溢出
            int mid = low + (high-low)/2;

            if(isBadVersion(mid)){

                high = mid-1;

            }else{
                low = mid+1;
            }

        }
        return low;
    }
}

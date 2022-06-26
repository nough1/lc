package com.nou.lc.dynamicprogramming;

import java.util.HashMap;

import java.util.Map;
import java.util.Objects;


/**
 * 现在有点感觉了，能想到 decision tree
 * 但是树上的细节需要想通,比如树上的节点模型.
 * https://www.youtube.com/watch?v=g0npyaQtAQM
 * 这个作者的思路不错
 * https://leetcode.com/problems/target-sum/
 *
 */
public class LC494 {

    class DecisionNode {

        DecisionNode(int index,int currSum){
            this.index = index;
            this.currSum = currSum;
        }
        public int index;
        public int currSum;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getCurrSum() {
            return currSum;
        }

        public void setCurrSum(int currSum) {
            this.currSum = currSum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DecisionNode item = (DecisionNode) o;
            return index == item.index &&
                    currSum == item.currSum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, currSum);
        }
    }
    Map<DecisionNode,Integer> map = new HashMap<>();


    public int findTargetSumWays(int[] nums, int target) {

        return backtrack(0,0,nums,target);
    }


    public int backtrack(int index,int preSum,int[] nums,int target){

        if(index==nums.length){
            if(target==preSum){
                return 1;
            }else {
                return 0;
            }
        }

        DecisionNode currNode = new DecisionNode(index,preSum);
        if(map.containsKey(currNode)){
            return map.get(currNode);
        }
        // 这里 currSum 的理解，有点绕 , 如果用 currSum+nums[index+1] 会 outofbound , 换个词会比较好理解 .
        int total = backtrack(index+1,preSum+nums[index],nums,target)+backtrack(index+1,preSum-nums[index],nums,target);
        map.put(currNode,total);

        return total;

    }
}

/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int size = nums.length,i;
        for(i=size-2;i>=0;i--){
            if(nums[i]<nums[i+1]){break;}
        }
        if(i >= 0) {
            int j = size - 1;
            while(nums[j] <= nums[i]) j--;
            nums[j] = swap(nums[i],nums[i]=nums[j]);
        }
        reverse(nums, i + 1, size - 1);
    }
    public static int swap(int x, int y){
        return x;
    }
    public void reverse(int[] nums, int i, int j) {
        while(i < j){
            nums[--j]=swap(nums[++i],nums[i]=nums[j]);
        }
    }
}

// @lc code=end


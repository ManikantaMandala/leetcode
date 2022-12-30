/*
 * @lc app=leetcode id=795 lang=java
 *
 * [795] Number of Subarrays with Bounded Maximum
 */

// @lc code=start
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int output = 0, count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]>=left && A[i]<=right)
                output += ++count;
            else
                count = 0;
        }
        return output;
    }
}
// @lc code=end


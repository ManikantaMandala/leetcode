/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2*size];
        for(int i=0;i<size;i++){
            ans[i]=nums[i]=ans[i+size];
            // ans[i]=nums[i];
            // ans[i+n]=nums[i];
        }
        return ans;
    }
}
// @lc code=end


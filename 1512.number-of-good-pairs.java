/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0,count[] = new int[101];
        for (int var : nums) {
            res+= count[var]++;
        }
        return res;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int output = 0;
        for(int i = 1; i*i <= x; i++)
            output=i;
        return output;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left=0,right = 46340,mid=0;
        while(left<=right){
            mid = left+ ((right-left)/2);
            if(mid* mid == x) return mid;
            else if(mid*mid>x) right = mid-1;
            else left = mid+1;
        }
        return right;
    }
}
// I think the time complexity is O(1)=O(log(46340))
// but others say that the time complexity is O(logN)
// @lc code=end


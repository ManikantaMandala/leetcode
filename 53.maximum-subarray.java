/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        ArrayList<Integer> subArray= new ArrayList<>();
        int s=0,maxSumSoFar=Integer.MIN_VALUE;
        int maxSumEndingAtIth=0;
        for(int i=0;i<nums.length;i++){
            maxSumEndingAtIth+=nums[i];
            if(maxSumEndingAtIth>maxSumSoFar){
                subArray.clear();
                maxSumSoFar=maxSumEndingAtIth;
                subArray.add(s);
                subArray.add(i);
            }
            if(maxSumEndingAtIth<0){
                s=i+1;
                maxSumEndingAtIth=0;
            }
        }
        return maxSumSoFar;
    }
}
// @lc code=end


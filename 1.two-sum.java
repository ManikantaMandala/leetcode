/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>(); //key is array value, value is index
        int oppVal;
        for(int i=0; i<nums.length;i++){
            oppVal=target-nums[i];
            if(map.containsKey(oppVal)){
                return new int[]{map.get(oppVal),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end


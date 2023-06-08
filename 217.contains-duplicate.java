/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (61.38%)
 * Likes:    8293
 * Dislikes: 1099
 * Total Accepted:    2.5M
 * Total Submissions: 4.1M
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        /*Attempt-1:
         * Using of two for loops
         */
        for(int i=0;i<size;i++){
            for(int j=1;i<size;j++){
                if(i==j){ continue; }
                else{
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        /* Attempt-2:
         * Using a hashing
         */
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<size;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}
// @lc code=end


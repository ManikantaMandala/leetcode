/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int size=nums.length,i=0;
//         for(int j=0;j<size;j++){
//             if(nums[i]!=nums[j]){
//                 i++;
//                 nums[i] = swap(nums[j],nums[j]=nums[i]);//we swap or override it
//             }
//         }
//         return i+1;
//     }
//     public static int swap(int x,int y){
//         return x;
//     }
// }
class Solution{
    public int removeDuplicates(int[] nums){
        return helper(nums,0,0);
    }
    public static int helper(int[] nums, int i, int j){
        int size=nums.length;
        for(;j<size;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return helper(nums,i,j);
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+ n*(nums[nums[i]]%n);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]+" ");
            
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        return nums;
    }
}
class Main{
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr= s.buildArray(new int[]{0,2,4,5,3,1});
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
// @lc code=end


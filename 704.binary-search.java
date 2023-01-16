/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public static int searchIterative(int[] nums,int target){
        int left=0,right=nums.length-1,mid;
        while(left<=right){
            mid = left+ ((right-left)/2);
            if(nums[mid]==target){return mid;} 
            else if(nums[mid]>target){right=mid-1;}
            else{left=mid+1;}
        }
        return -1;
    }
    public static int searchRecursive(int[] nums,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid = left+ ((right-left)/2);
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) 
        {return searchRecursive(nums,target,left,mid-1);}
        else return searchRecursive(nums,target,mid+1,right);
    }
    public static int search(int[] nums,int target){
        // return searchIterative(nums,target);
        return searchRecursive(nums,target,0,nums.length-1);
    }
}
// @lc code=end


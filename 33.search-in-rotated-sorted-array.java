/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int min;
        int size= nums.length;
        for(min=0;min<size-1;min++){
            if(nums[min]>nums[min+1]){
                break;
            }
        }
        int left=0,right=min;
        int value1=binarySearch(nums,target,left,right);
        left=min+1;right=size;
        int value2=binarySearch(nums,target,left,right);
        if(value1==-1&&value2==-1) return -1;
        if(value1==-1&&value2!=-1) return value2;
        else return value1;
    }
    public static int binarySearch(int[] nums,int target,int left,int right){
        int mid;
        while(left<=right){
            mid=left + ((right-left)/2);
            if(nums[mid]==target){ return mid; }
            else if(nums[mid]<target){ left = mid+1; }
            else right = mid-1;
        }
        return -1;
    }
}
// @lc code=end


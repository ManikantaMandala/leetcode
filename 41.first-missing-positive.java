/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]<1 || nums[i]>size){
                nums[i]=size+1;
            }
        }//make val 
        //greater than size
        //or less than 1 to size+1;
        int val;
        for (int i = 0; i < size; i++) {
            val=Math.abs(nums[i]);
            if (val>size) {// continue when it is greater than size
                continue;
            }
            val--;
            if(nums[val]>0) nums[val]=- nums[id];
        }// make val th index negative to refer back
        for (int i=0; i<size; i++) {
            if(nums[i]>0) return i+1;
        }//return the index+1 of the positive element
        return n+1;//else return n+1;
    }
}
// @lc code=end


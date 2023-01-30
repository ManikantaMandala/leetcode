/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        int rows=intervals.length;
        sort2D(intervals,0,rows-1);
        return intervals;
    }
    public void sort2D(int[][] matrix,int left,int right){
        int mid=left + (right-left)/2;
        if(left<right){
            sort2D(matrix,left,mid);
            sort2D(matrix,mid+1,right);
            sort2dMergeSort(matrix,left,mid,right);
        }
    }
    public void sort2dMergeSort(int[][] matrix,int left,int mid,int right){
        
    }
}
// @lc code=end


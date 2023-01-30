/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        // Input:
        // [[1,2,3]
        //  [4,5,6]
        //  [7,8,9]
        // ]
        // Output:
        // [[7,4,1]
        //  [8,5,2]
        //  [9,6,3]]
        int row= matrix.length;
        int col= matrix[0].length;
        for(int i=1;i<row;i++){
            for(int j=0;j<i;j++){
                matrix[j][i]=swap(matrix[i][j],matrix[i][j]=matrix[j][i]);
            }
        }
        for(int i=0;i<row;i++){
            reverse(matrix[i],0,col-1);
        }
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            nums[j]=swap(nums[i],nums[i]=nums[j]);
            i++;
            j--;
        }
    }
    public static int swap(int x,int y){ return x;}
}
// @lc code=end


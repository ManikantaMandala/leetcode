/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        //HashSet for positions of zeros.
        int row = matrix.length,col =matrix[0].length;
        int col0=1;
        //approach-1
        // int[] colDummy = new int[col];
        // int[] rowDummy = new int[row];

        // approach-2
        // Use starting row and column of the matrix for storing and
        // traverse backward
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0) col0=0;
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=row-1;i>-1;i--){
            for(int j=col-1;j>0;j--){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}
// @lc code=end


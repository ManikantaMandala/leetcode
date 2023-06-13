import java.util.Queue;
import java.util.LinkedList;

/*
 *     +-----+-----+-----+         +-----+-----+-----+ 
 *     |  1  |  1  |  1  |         |  2  |  2  |  2  | 
 *     +-----+-----+-----+         +-----+-----+-----+ 
 *     |  1  |  1  |  0  |    =>   |  2  |  2  |  0  | 
 *     +-----+-----+-----+         +-----+-----+-----+ 
 *     |  1  |  0  |  1  |         |  2  |  0  |  1  | 
 *     +-----+-----+-----+         +-----+-----+-----+ 
 */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //// using bfs
        // int n = image.length;
        // int m = image[0].length;

        // Queue<pair> levelElements = new LinkedList<>();
        // boolean[][] visitedArray = new boolean[n][m];
        // int currentRow, currentCol;
        // int startingIndexColor = image[sr][sc];

        // levelElements.add(new pair(sr,sc));
        // while(!levelElements.isEmpty()){
        // // get the node values;
        // currentRow = levelElements.peek().getRow();
        // currentCol = levelElements.peek().getCol();
        // visitedArray[currentRow][currentCol]=true;

        // levelElements.remove();

        // if(image[currentRow][currentCol]==startingIndexColor){
        // image[currentRow][currentCol] = color;
        // getNeighours(currentRow, currentCol, image, levelElements, visitedArray);
        // }
        // }

        // using dfs
        int iniColor = image[sr][sc];
        int[][] ans = image;
        // delta row and delta column for neighbours
        int delRow[] = { -1, 0, +1, 0 };
        int delCol[] = { 0, +1, 0, -1 };
        dfs(sr, sc, ans, image, color, delRow, delCol, iniColor);
        return ans;
    }

    void dfs(int row, int col,
            int[][] ans,
            int[][] image,
            int newColor, int delRow[], int delCol[],
            int iniColor) {
        // color with new color
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        // there are exactly 4 neighbours
        for (int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            // check for valid coordinate
            // then check for same initial color and unvisited pixel
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }
    }

    public void getNeighours(int currentRow, int currentCol, int[][] image, Queue<pair> levelElements,
            boolean[][] visitedArray) {

        int[] dRow = { -1, 0, 1, 0 };
        int[] dCol = { 0, 1, 0, -1 };
        int row, col;
        for (int i = 0; i < 4; i++) {
            row = currentRow + dRow[i];
            col = currentCol + dCol[i];

            if (row >= 0 && row < image.length && col >= 0 && col < image[0].length && !visitedArray[row][col]) {
                levelElements.add(new pair(row, col));
            }
        }
    }
}

class pair {
    int row;
    int col;

    public pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

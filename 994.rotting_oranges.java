import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        // using bfs
        int m = grid.length;
        int n = grid[0].length;
        Queue<pair> levelElements = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int count = 0,i,j,time;
        isVisitedRotten(grid, visited, levelElements);
        while (!levelElements.isEmpty()) {
            i= levelElements.peek().getI();
            j= levelElements.peek().getJ();
            time = levelElements.peek().getTime();
            levelElements.remove();
            if (grid[i][j] == 1) {
                grid[i][j] = 2;
            }
            if(grid[i][j] == 2){
                addNeighbours(levelElements, i, j, visited, time, grid);
            }
            count = time;
        }

        return isRotten(grid) ? count : -1;
    }

    private void addNeighbours(Queue<pair> levelElements,
            int i, int j, boolean[][] visited, int time, int[][] grid) {
        int nRow;
        int nCol;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = { 0, 1, 0, -1};

        for(int k=0;k<4;k++){
            nRow = i+dRow[k];
            nCol = j+dCol[k];
            addElements(nRow, nCol, visited, levelElements, time, grid);
        }
    }

    private void addElements(int i, int j, boolean[][] visited,
            Queue<pair> levelElements, int time, int[][] grid) {
        if (i>=0&& i<visited.length && j>=0 && j<visited[0].length &&
        !visited[i][j] && grid[i][j]!=0) {
            levelElements.add(new pair(i, j, time+1));
            visited[i][j] = true;
        }
    }

    private void isVisitedRotten(int[][] grid, boolean[][] visited,
            Queue<pair> levelElements) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2 && !visited[i][j]) {
                    levelElements.add(new pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
    }

    private boolean isRotten(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

class pair {
    int i, j, time;
    public pair(int i, int j, int time) {
        this.i = i;
        this.j = j;
        this.time = time;
    }
    public int getTime() {
        return time;
    }
    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }
}

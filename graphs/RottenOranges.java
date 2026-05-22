package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    // Helper class to store row, col, and time
    static class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    static int rottenOranges(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int freshCount = 0;

        // Step 1: Add all rotten oranges into queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // Directions: up, down, left, right
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};

        int time = 0;
        int rottenFresh = 0;

        // Step 2: BFS Traversal
        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            int row = current.row;
            int col = current.col;
            int t = current.time;

            time = Math.max(time, t);

            for (int i = 0; i < 4; i++) {

                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                // Check boundaries and fresh orange
                if (newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        grid[newRow][newCol] == 1) {

                    // Make it rotten
                    grid[newRow][newCol] = 2;

                    queue.offer(new Pair(newRow, newCol, t + 1));

                    rottenFresh++;
                }
            }
        }

        // If some fresh oranges are left
        if (rottenFresh != freshCount) {
            return -1;
        }

        return time;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int ans = rottenOranges(grid);

        System.out.println("Minimum Time = " + ans);
    }
}

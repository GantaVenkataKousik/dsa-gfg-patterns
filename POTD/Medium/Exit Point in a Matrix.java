class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        int i = 0, j = 0, dir = 0;
        int[][] pos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while (true) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dir++;
                dir %= 4;
            } else {
                if ((i == (n - 1) && dir == 1) || 
                (j == (m - 1) && dir == 0) || 
                (j == 0 && dir == 2) || 
                (i == 0 && dir == 3)) {
                    break;
                }
                i += pos[dir][0];
                j += pos[dir][1];
            }
        }
        
        return new int[]{i, j};
    }
}

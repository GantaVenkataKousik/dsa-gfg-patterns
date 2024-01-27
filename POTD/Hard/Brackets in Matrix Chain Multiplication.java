
class Solution{
    
    static String printOptimalParens(int[][] s, int i, int j) {
        if (i == j) {
            return String.valueOf((char)('A' + i - 1)); // Naming matrices as 'A', 'B', 'C', etc.
        } else {
            return "(" + printOptimalParens(s, i, s[i][j]) + printOptimalParens(s, s[i][j] + 1, j) + ")";
        }
    }
    
    
    static String matrixChainOrder(int p[], int n){
               // code here
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        // m[i][i] is zero as the cost of multiplying one matrix is zero
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }

        // L is chain length
        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }

        // Constructing the output string
        return printOptimalParens(s, 1, n - 1);

    }
}

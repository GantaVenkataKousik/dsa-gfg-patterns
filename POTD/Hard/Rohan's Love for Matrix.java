class Solution {
    
    static long mod = 1000000007;
    
    static long[][] multiply(long[][] m1, long[][] m2) {
        long[][] g = new long[2][2];
        g[0][0] = (m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0]) % mod;
        g[0][1] = (m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1]) % mod;
        g[1][0] = (m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0]) % mod;
        g[1][1] = (m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1]) % mod;
        return g;
    }

    static int firstElement(int n) {
        long[][] v = { { 1, 1 }, { 1, 0 } };
        long[][] unit = { { 1, 0 }, { 0, 1 } };
        while (n > 0) {
            if (n % 2 == 1)
                unit = multiply(v, unit);
            v = multiply(v, v);
            n >>= 1;
        }
        return (int)unit[1][0];
    }
    
}

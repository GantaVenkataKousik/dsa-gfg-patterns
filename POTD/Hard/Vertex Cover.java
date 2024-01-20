
class Solution {
    
        static boolean isPsbl(int n, int m, int mid, List<List<Integer>> adjlst) {
        int base = (1 << mid) - 1;
        int last = 1 << n;

        while (base < last) {
            boolean[][] vis = new boolean[n + 1][n + 1];

            int ec = 0;

            for (int j = 1, u = 1; j < last; j = j << 1, u++) {
                if ((base & j) != 0) {
                    for (int v = 1; v <= n; v++) {
                        if (adjlst.get(u).contains(v) && !vis[u][v]) {
                            ec++;
                            vis[u][v] = true;
                            vis[v][u] = true;
                        }
                    }
                }
            }

            if (ec == m) return true;

            int rmst = base & -base;

            int res = base + rmst;

            base = (((res ^ base) >> 2) / rmst) | res;
        }

        return false;
    }
    public static int vertexCover(int n, int m, int[][] edges) {
        // code here
                List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            ans.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            ans.get(edge[0]).add(edge[1]);
            ans.get(edge[1]).add(edge[0]);
        }

        int l = 1, r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (isPsbl(n, m, mid, ans)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}
        

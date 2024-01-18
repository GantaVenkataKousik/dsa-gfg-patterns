class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        
        int[][] cor = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
        boolean[][]  visited= new boolean[N][N];
        visited[KnightPos[0]-1][KnightPos[1]-1] = true;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(KnightPos[0]-1,KnightPos[1]-1));
        int minSteps = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0 ; i<n ; i++){
                Pair p = q.poll();
                int xC = p.x;
                int yC=  p.y;
                
                if(xC == TargetPos[0]-1 && yC == TargetPos[1]-1)return minSteps;
                
                for(int k = 0 ; k<8 ; k++){
                    int x = xC + cor[k][0];
                    int y = yC + cor[k][1];
                    if(x>=0 && y>=0 && x<N && y<N && !visited[x][y]){
                        q.add(new Pair(x,y));
                        visited[x][y] = true;
                    }
                    
                }
            }
            minSteps++;
        }
        return minSteps;
    }
}



//User function Template for Java

class Solution
{
    public int isPossible(int[][] path)
    {
        for(int i=0 ; i<path.length ; i++){
            int cnt = 0;
            for(int j=0 ; j<path[0].length ; j++){
                if(path[i][j] == 1)cnt++;
            }
            if(cnt%2!=0)return 0;
        }
        return 1;
    }
}


class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int i1 = 0 , j1 =0 , i2 = n-1 , j2=n-1;

        int pairs = 0;

        while(i1<n && i2>=0){
            if(mat1[i1][j1]+mat2[i2][j2]<=x){
                if(mat1[i1][j1]+mat2[i2][j2]==x){
                    pairs++;
                }
                j1++;
                if(j1==n){
                    j1=0;
                    i1++;
                }
            }
            else{
                j2--;
                if(j2==-1){
                    j2=n-1;
                    i2--;
                }
            }
        }
        return pairs;
    }
}

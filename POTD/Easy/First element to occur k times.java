
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int[] aux = new int[10000];
        for(int i=0 ; i<n ; i++){
            aux[a[i]]++;
            if(aux[a[i]]>=k)return a[i];
        }
        return -1;
    } 
}

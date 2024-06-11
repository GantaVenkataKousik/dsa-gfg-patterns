class Solution {
    
    public static boolean findNoOf4s(int num){
        
        while(num>0){
            if(num%10 == 4)return true;
            num /= 10;
        }
        return false;
        
    }
    
    public static int countNumberswith4(int n) {
        int cnt = 1;
        if(n<4)return 0;
        if(n<14)return 1;
        for(int i=14; i<=n ; i++){
            cnt+=(findNoOf4s(i)?1:0);
        }
        return cnt;
    }
}

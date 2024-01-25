class Solution{
    
    private int replaceDigit(int num,int position,int digit){
        int[] digits = new int[4];
        for(int i=3; i>=0 ; i--){
            digits[i] = num%10;
            num /= 10;
        }
        digits[position] = digit;
        return digits[3]+digits[2]*10+digits[1]*100+digits[0]*1000;
    }
    
    private boolean isFourDigitPrime(int num){
        if(num<1000 || num>9999)return false;
        
        for(int i=2 ; i<=Math.sqrt(num) ; i++){
            if(num%i == 0)return false;
        }
        return true;
    }
    
    int solve(int num1,int num2){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        
        int steps = 0;
        
        q.add(num1);
        visited.add(num1);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            for(int m=0 ; m<n  ;m++){
                int num = q.poll();
            
            
                if(num == num2)return steps;
                
                for(int i=0 ; i<4 ; i++){
                    for(int k = 0 ; k< 10 ; k++){
                        if(i==0 && k==0)continue;
                    
                        int nextNum = replaceDigit(num,i,k);
                        
                        if(isFourDigitPrime(nextNum) && !visited.contains(nextNum)){
                            visited.add(nextNum);
                            q.add(nextNum);
                        }
                        
                    }
                }
            }
            steps++;
        }
        
        return -1;
    }
}

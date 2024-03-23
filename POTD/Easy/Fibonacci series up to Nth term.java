    if(n==0) {
        return {0};
    }
    if(n==1) {
        return {0,1};
    }
    
    int mod = 1e9+7;
    vector<int>fib(n+1) ;
    fib[0] = 0;
    fib[1] = 1;
    for(int i =2; i<= n; i++){
        fib[i] = (fib[i-1] + fib[i-2] ) % mod;
    }
    return fib;

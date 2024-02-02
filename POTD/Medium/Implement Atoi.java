

//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	    int n = s.length();
	    if(n==1){
	        return (s.charAt(0)!='-'?((s.charAt(0)-'0')):-1);
	    }
	    char firstDigit = s.charAt(0);
	    int nums = (int)firstDigit ;
	    if(firstDigit !='-'){
	        if( nums < 48 || nums >=58)return -1;
	    }
	    
	    
        int num = 0;
	    
	    boolean neg = false;
        if(firstDigit == '-'){
            neg = !neg;
        }
        else{
            num = num*10 + (s.charAt(0)-'0');
        }
        
        for(int i=1 ; i<n ; i++){
            nums = (int)(s.charAt(i)); 
            if(nums < 48 || nums >=58)return -1;
            num = num*10 + (s.charAt(i)-'0');
        }
        
        return (neg)?(-1*num):(num);
    }
}

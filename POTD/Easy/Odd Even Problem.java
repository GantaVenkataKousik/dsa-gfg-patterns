class Solution {
    public static String oddEven(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        
        int sum=0;
        
        for(int i=1 ; i<=26 ; i++){
            if(freq[i-1]!=0){
            if(i%2==0 && freq[i-1]%2==0)sum++;
            else if(i%2!=0 && freq[i-1]%2!=0)sum++;
            }
                
            }
        
        return (sum%2==0)?"EVEN":"ODD";
    }
}

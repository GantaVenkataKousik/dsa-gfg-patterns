class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        int[] alpha = new int[26];
        for(char ch : s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alpha[Character.toLowerCase(ch)-'a']++;
            }
        }
        for(int i=0 ; i<26 ;  i++){
            if(alpha[i]==0)return false;
        }
        return true;
    }
}

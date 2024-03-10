
class Solution {
    String removeDuplicates(String str) {
        Set<Character> st = new HashSet<>();
        String ans = "";
        for(char ch : str.toCharArray()){
            if(!st.contains(ch)){
                ans += ch;
            }
            st.add(ch);
        }
        return ans;
    }
}


class Solution
{
    
    private static void find(String s,List<String> ans,int index,
    String str,int n){
        if(index==n){
            ans.add(str);
            return ;
        }
        find(s,ans,index+1,str+s.charAt(index),n);
        find(s,ans,index+1,str,n);
        return ;
    }
    
    public List<String> AllPossibleStrings(String s)
    {
        List<String> ans = new ArrayList<>();
        find(s,ans,0,"",s.length());
        Collections.sort(ans);
        ans.remove(0);
        return ans;
    }

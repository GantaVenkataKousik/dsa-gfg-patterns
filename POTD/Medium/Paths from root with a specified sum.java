

class Solution
{
    
    static void Helper(Node root,int sum,ArrayList<Integer> list
    ,ArrayList<ArrayList<Integer>> ans){

        if(root == null)return ;
        
        
        list.add(root.data);
        sum -= root.data;
        
        if(sum==0){
            ans.add(new ArrayList<>(list));    
        }
        
        Helper(root.left,sum,list,ans);
        Helper(root.right,sum,list,ans);
        
        list.remove(list.size()-1);
    }
    
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=  new ArrayList<>();
        
        Helper(root,sum,list,ans);
        return ans;
        
    }
}

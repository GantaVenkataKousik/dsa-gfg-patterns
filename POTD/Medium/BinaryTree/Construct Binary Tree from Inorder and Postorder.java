class GfG
{
    
    Node constructTree(Map<Integer,Integer> mp,int in[],int inStart , 
    int inEnd , int post[] , int postStart , int postEnd){
        
        if(inStart>inEnd || postStart>postEnd)return null;
        
        int idx = mp.get(post[postEnd]);
        int numLeft = idx-inStart;
        Node node = new Node(post[postEnd]);
        
        node.left = constructTree(mp,in,inStart,idx-1,post,postStart,postStart+numLeft-1);
        node.right = constructTree(mp,in,idx+1,inEnd,post,postStart+numLeft,postEnd-1);
        
        return node;
    }
    
    Node buildTree(int in[], int post[], int n) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n ;i++){
            mp.put(in[i],i);
        }
        return constructTree(mp,in,0,n-1,post,0,n-1);
    }
}


class Solution{
    Map<Node,Node> mp = new HashMap<>();
    Node cloneGraph(Node node){
        if(node==null)return null;
        if(mp.containsKey(node))return mp.get(node);
        
        Node clone = new Node(node.val);
        mp.put(node,clone);
        for(Node neighbor : node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
        
    }
}


class Solution {
    void rearrange(ArrayList<Integer> arr) {
       ArrayList<Integer> pos= new ArrayList<>();
       ArrayList<Integer> neg = new ArrayList<>();
       for(int ele : arr){
          if(ele < 0)neg.add(ele);
          else pos.add(ele);
       }
        int posSize = pos.size() , negSize = neg.size();
        int i = 0 , j=0 , k=0;
        while(i<posSize && j<negSize){
            arr.set(k++,pos.get(i++));
            arr.set(k++,neg.get(j++));
        }
        while(i<posSize){
            arr.set(k++,pos.get(i++));
        }
        while(j<negSize){
            arr.set(k++,neg.get(j++));
        }
        return ;
    }
}

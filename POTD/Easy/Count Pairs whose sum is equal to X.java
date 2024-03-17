
class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        Set<Integer> st = new HashSet<>();
        for(int num : head1){
            st.add(num);
        }
        int cnt=0;
        for(int num : head2){
            if(st.contains(x-num))cnt++;
        }
        return cnt;
    }
}

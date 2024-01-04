class Solution {
    static int singleElement(int[] arr , int N) {
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int ele : arr){
            if(st1.contains(ele))st2.add(ele);
            else st1.add(ele);
        }
        for(int ele : arr){
            if(!st2.contains(ele))return ele;
        }
        return -1;
    }
}

class Solution {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        StringBuffer sb = new StringBuffer();
        for(int i = arr.length - 1 ; i>=0 ; i--){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

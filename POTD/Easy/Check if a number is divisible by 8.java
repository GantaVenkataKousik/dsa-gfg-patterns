class Solution{
    int DivisibleByEight(String s){
        if(s.equals(""))return -1;
        if(s.length()<=3){
            return (Integer.parseInt(s)%8==0)?1:-1;
        }
        return (Integer.parseInt(s.substring(s.length()-3))%8==0)?1:-1;
    }
}

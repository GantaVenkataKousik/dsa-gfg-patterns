class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        int x  = 0;
             ArrayList<Integer> arr = new ArrayList<>() ;

        while(text.indexOf(pattern,x)!=-1)

        {

            x=text.indexOf(pattern,x) ;

            arr.add(x+1);

            x++;

        }

        return arr;
    }
}


class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
                String str = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n/2 + 1; j++) {
                if (s.charAt(j) == '1') {
                    str += "10";
                } else {
                    str += "01";
                }
            }
            s = str;
            str = "";
        }
        return s.charAt(n);
    }
}

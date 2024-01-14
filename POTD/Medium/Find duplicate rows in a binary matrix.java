class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
                ArrayList<Integer> result = new ArrayList<>();
        HashSet<String> rowSet = new HashSet<>();

        for (int i = 0; i < m; i++) {
            // Convert the row array to a string to ensure content-based comparison
            String rowAsString = Arrays.toString(matrix[i]);

            if (rowSet.contains(rowAsString)) {
                result.add(i);
            } else {
                rowSet.add(rowAsString);
            }
        }

        return result;
    }

}

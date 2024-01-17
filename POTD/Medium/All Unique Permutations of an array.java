
class Solution {
    
    static void swap(ArrayList<Integer> arr,int i,int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    
    static void generatePermutations(ArrayList<Integer> arr, int n, ArrayList<Integer> currentPermutation,
                                     boolean[] used, ArrayList<ArrayList<Integer>> result) {
        if (currentPermutation.size() == n) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < n; i++) {
            // Skip if the element is already used or if it's a duplicate
            if (used[i] || (i > 0 && arr.get(i) == arr.get(i - 1) && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            currentPermutation.add(arr.get(i));

            generatePermutations(arr, n, currentPermutation, used, result);

            used[i] = false;
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }
    
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[n];

        // Sort the input array to handle duplicates
        Collections.sort(arr);

        generatePermutations(arr, n, currentPermutation, used, result);

        return result;
    }
};

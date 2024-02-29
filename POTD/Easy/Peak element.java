class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        int idx = 0;
        while(idx<n-1 && arr[idx]<=arr[idx+1])idx++;
        return idx;
    }
}

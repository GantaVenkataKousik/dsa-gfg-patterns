
class bag{
    int weight;
    int profit;
    double ratio;
    bag(int w,int p,double r){
        weight = w;
        profit = p;
        ratio  =r;
    }
}


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
        bag a[] = new bag[n];
        
        for(int i=0 ; i<n  ; i++){
            a[i] = new bag(arr[i].weight,arr[i].value,arr[i].value/(double)arr[i].weight);
        }
        
        Arrays.sort(a,(b,c)->Double.compare(c.ratio,b.ratio));
        
        double maxProfit = 0.0;
        int i=0;
        while(W != 0 && i<n){
            if(a[i].weight < W){
                maxProfit += a[i].profit;
                W -= a[i].weight;
                i++;
            } 
            else{
                maxProfit += (a[i].ratio * W);
                break;
            }
        }
        return maxProfit;
        
    }
}

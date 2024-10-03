class Solution {
  public:
    // Function to find the majority elements in the array
    vector<int> findMajority(vector<int>& nums) {
        vector<int>ans;
        int n = nums.size();
        int can1, can2, counter1 = 0, counter2 = 0;
        
        for(int i = 0; i < n; i++){
            if(nums[i] == can1) counter1++;
            else if(nums[i] == can2) counter2++;
            else if(counter1 == 0){
                can1 = nums[i];
                counter1++;
            }
            else if(counter2 == 0){
                can2 = nums[i];
                counter2++;
            }
            else{
                counter1--;
                counter2--;
            }
        }
        int voteA = 0, voteB = 0;
        for(auto it : nums) {
            if(it == can1) voteA++;
            if(it == can2) voteB++;
        }
        if(voteA > n/3) ans.push_back(can1);
        if(voteB > n/3) ans.push_back(can2);
        if(ans.size() == 0) ans.push_back(-1);
        
        return ans;
    }
};

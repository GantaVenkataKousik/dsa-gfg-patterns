class Solution {
  public:
    vector<vector<int>> kTop(vector<int>& a, int N, int K) {
        // code here
                vector<vector<int>> final_ans;
        vector<int> top(K + 1, 0);
        unordered_map<int, int> freq;
    
        for (int m = 0; m < N; ++m) {
            if (freq.find(a[m]) != freq.end()) {
                freq[a[m]] += 1;
            } else {
                freq[a[m]] = 1;
            }
    
            top[K] = a[m];
            int i = find(top.begin(), top.end(), a[m]) - top.begin() - 1;
    
            while (i >= 0) {
                if (freq[top[i]] < freq[top[i + 1]]) {
                    swap(top[i], top[i + 1]);
                } else if ((freq[top[i]] == freq[top[i + 1]]) && (top[i] > top[i + 1])) {
                    swap(top[i], top[i + 1]);
                } else {
                    break;
                }
                i -= 1;
            }
    
            i = 0;
            vector<int> ans;
            while (i < K && top[i] != 0) {
                ans.push_back(top[i]);
                i += 1;
            }
    
            final_ans.push_back(ans);
        }
    
        return final_ans;
    }
};

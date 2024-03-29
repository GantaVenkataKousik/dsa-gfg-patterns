        int left = 0, right = 0;
        long long  sum = arr[0];
        while(right < n )
        {
            while( sum > s && left < right)
            {
                sum -= arr[left];
                left++;
            }
            if(sum == s) return { left+1, right+1};
            
             right++;
            if(right < n)
            {
                sum += arr[right];
            }
        }
        return {-1};


       int n=mat.size(),up =1, i=0,j=0;
        vector<int>v;
        while(i<n && j<n)
        {

            if(up==1 && i>0 && j<n-1)
            {
                v.push_back(mat[i][j]);
                i--;
                j++;
            }
            else if(up ==0 && i<n-1 && j>0)
            {
                v.push_back(mat[i][j]);
                i++;
                j--;
            }
            else if(up ==1)
            {
                if(j==n-1)
                {
                   v.push_back(mat[i][j]);
                   i++;
                   up=0;
                }
                else if(j!=n-1)
                {
                    v.push_back(mat[i][j]);
                     j++;
                     up=0;
                }
            }
            else if(up ==0)
            {
                if(j==0 && i==n-1)
                {
                    v.push_back(mat[i][j]);
                     j++;
                     up=1;
                }
                else if(j==0 && i!=n-1)
                {
                    v.push_back(mat[i][j]);
                     i++;
                     up=1;
                }
                else if(j!=0)
                {
                   v.push_back(mat[i][j]);
                   j++;
                   up=1;
                }
            }
        }
        return v;

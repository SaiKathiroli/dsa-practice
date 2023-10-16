class Solution {
    public int counts(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int count = 0;
        count +=1;
        while((n!=0))
        {
            if((n&1) == 1)
            {
                return count;
            }
            count+=1;
            n=n>>1;
        }
        return count;
    }
    public int binaryGap(int n) 
    {
        int max=0;
       while(n!=0)
        {
            if((n&1) == 1)
            {
                n=n>>1;
                int shiftorCount = counts(n);
               max = Math.max(max,shiftorCount);
               n=n>>shiftorCount-1;
            }
            else
            {
                n=n>>1;
            }
        }
       return max;
    }
}
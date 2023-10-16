class Solution {
    public int primeNumber(int n)
    {
        if(n==1 || n==0) return 0;
        for(int i=2;i<n;i++)
        {
            if((n%i)==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public int countPrimeSetBits(int left, int right) 
    {
        int count=0;
        while(left<=right)
        {
            int n=left;
            int bCount=0;
            while(n!=0)
            {
                if((n&1)==1)
                {
                    bCount+=1;
                }
                n=n>>1;
            }
            count += primeNumber(bCount);
            left=left+1;
        }
        // System.out.println(count);
        return count;
    }
}
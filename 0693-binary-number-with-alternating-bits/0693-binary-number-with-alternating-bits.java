class Solution {
    public boolean hasAlternatingBits(int n) 
    {
        boolean ans=false;
        while(n!=0)
        {
            int lb1=n&1;
           // n=n>>1;
            int lb2=(n>>1)&1;
           // n=n>>1;
            if(lb1 != lb2)
            {
                ans = true;
            }
            else
            {
                ans=false;
                break;
            }
            n=n>>1;
        }
         return ans;
    }
}
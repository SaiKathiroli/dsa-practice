class Solution {
    public int bitwiseComplement(int n) 
    {
        if(n==0)
        {
            return 1;
        }
        int count = 0;
        int i=0;
        while(n!=0)
        {
            int lastBit = (n&1)^1;
            count = count + lastBit*(int)Math.pow(2,i);
            n = n >> 1;
            i+=1;
        }
        return count;
    }
}
class Solution {
    public int numberOfBeams(String[] bank) 
    {
        int count = 0;
        for(int i=0;i<bank.length-1;i++)
        {
            int q = helper(bank[i]);
            int j = i+1;
            if(q==0) continue;
            while(true && j<bank.length)
            {
              int nxt = helper(bank[j]);
              if(nxt != 0)
              {
                  count = count + (q*nxt);
                  break;
              }
              else
              {
                  j = j+1;
              }
            }
        }
        return count;
    }
    public int helper(String s)
    {
        int c = 0;
        for(char ch:s.toCharArray())
        {
            if(ch == '1')
            {
                c = c+1;
            }
        }
        return c;
    }
}
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) 
    {
        // int l = 0;
        // int r = s.length()-1;
        int max = -1;
        // while(l<r)
        // {
        //     if(s.charAt(l) == s.charAt(r))
        //     {
        //         max = Math.max(max,helper(s.substring(l,r+1)));
        //     }
        //     l=l+1;
        //     r=r-1;
        // }
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>i;j--)
            {
            if(s.charAt(i) == s.charAt(j))
            {
                max = Math.max(max,helper(s.substring(i,j+1)));
            }
            }
        }
        return max;
    }

    public int helper(String s)
    {
        return s.length()-2;
    }
}
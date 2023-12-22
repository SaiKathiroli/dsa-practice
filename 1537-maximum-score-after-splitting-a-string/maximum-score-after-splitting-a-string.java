class Solution {
    int max = Integer.MIN_VALUE;
    public int maxScore(String s) 
    {
        helper(""+s.charAt(0),s.substring(1));
        return max;
    }
    public void helper(String p,String up)
    {
        if(up.isEmpty()) return;
        helper2(p,up);
        helper(p+up.charAt(0),up.substring(1));
    }
    public void helper2(String l,String r)
    {
        int sumL = 0;
        int sumR = 0;
        for(int i=0;i<=l.length()-1;i++)
        {
            if(l.charAt(i) == '0')
            {
                sumL = sumL + 1;
            }
        }
        for(int i=0;i<=r.length()-1;i++)
        {
            if(r.charAt(i) == '1')
            {
                sumR = sumR + 1;
            }       
        }
        // while(l != 0)
        // {
        //     sumL = sumL + (int)l%10;
        //     l = l/10;
        // }
        // while(r != 0)
        // {
        //     sumR = sumR + (int)r%10;
        //     r = r/10;
        // }
        max = Math.max(max,sumL+sumR);
    }
}
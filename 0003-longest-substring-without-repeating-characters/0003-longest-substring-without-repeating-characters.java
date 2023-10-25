class Solution {
    public int max = 0;
    public int lengthOfLongestSubstring(String s) 
    {
        for(int i=0;i<s.length();i++) 
        {
            helper("", s.substring(i));
        }
        return max;
    }

    public void helper(String p,String up)
    {
        if(up.isEmpty())
        {
            if(p.length()>=max)
            {
                max = p.length();
            }
            return;
        }

        if(p.indexOf(up.charAt(0)) != -1)
        {
            if(p.length()>=max)
            {
                max = p.length();
            }
            return;
        }
        helper(p+up.charAt(0),up.substring(1));
    }
}
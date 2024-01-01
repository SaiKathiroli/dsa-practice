class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<s.length;j++)
            {
                if(s[j] >= g[i] && s[j] != -1)
                {
                    count = count + 1;
                    s[j] = -1;
                    break;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int findCenter(int[][] edges) 
    {
        int q = edges[0][0];
        int w = edges[0][1];
        int result = 1;
        if(edges[1][0] == q)
        {
            result = edges[1][0];
        }
        else if(edges[1][1] == q)
        {
            result = edges[1][1];
        }
        else if(edges[1][0] == w)
        {
            result = edges[1][0];
        }
        else if(edges[1][1] == w)
        {
            result = edges[1][1];
        }    
        return result;
    }
}
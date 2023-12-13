class Solution {
    int count = 0;
    public int numSpecial(int[][] mat) 
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j] == 1)
                {
                    boolean X = rowCheck(mat,j,i);
                    boolean Y = columnCheck(i,mat,j);
                    if(X && Y)
                    {
                        count = count+1;
                    }
                }
            }
        }
        return count;
    }

    public boolean rowCheck(int[][] mat,int j,int v)
    {
        for(int i=0;i<mat.length;i++)
        {
            if(i==v) continue;
            if(mat[i][j] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean columnCheck(int i,int[][] mat,int v)
    {
        for(int j=0;j<mat[0].length;j++)
        {
            if(j==v) continue;
            if(mat[i][j] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
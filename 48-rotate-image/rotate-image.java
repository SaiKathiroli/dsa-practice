class Solution {
    public void rotate(int[][] matrix) 
    {
        Queue<Integer>  q = new LinkedList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                q.add(matrix[i][j]);
            }
        }
        for(int j=col-1;j>=0;j--)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][j] = q.remove();
            }
        }
    }
}
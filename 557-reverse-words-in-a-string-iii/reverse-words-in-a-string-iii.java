class Solution {
    public String reverseWords(String s) 
    {
        String[] X = s.split(" ");
        for(int i=0;i<X.length;i++)
        {
            String C = X[i];
            String V = "";
            for(int j=0;j<C.length();j++)
            {
                V = C.charAt(j) + V;
            }
            X[i] = V + " ";
        }
        String M = "";
        for(int i=0;i<X.length;i++)
        {
            M = M + X[i];
        } 

        return M.substring(0,M.length()-1);
    }
}
class Solution {
    public int secondHighest(String s) 
    {
        int first = -1;
        int second = -1;
        for(int i=0;i<s.length();i++)
        {
            int x = s.charAt(i)-'0';
            if(x >= 0 && x <= 9)
            {
                if(x > first )
                {
                    int temp = first;
                    first = x;
                    second = temp;
                }
          
                else if(x>=second && x<first)
                {
                    second = x;
                }

            }
        }
        return second;
    }
}
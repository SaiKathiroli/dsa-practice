class Solution {
    public int totalMoney(int n) 
    {
        int full_week = n/7;
        int result=0;
        int week_count=7;
        for(int i=0;i<full_week;i++)
        {
            int remov=0;
            for(int j=0;j<=i;j++)
            {
                remov=remov+j;
            }
            result = result+(week_count*(week_count+1))/2 - remov;
            week_count=week_count+1;
        }
        int y=full_week+1;
        int yy = n%7;
        while(yy>0)
        {
            result=result+y;
            y=y+1;
            yy=yy-1;
        }
        return result;
    }
}
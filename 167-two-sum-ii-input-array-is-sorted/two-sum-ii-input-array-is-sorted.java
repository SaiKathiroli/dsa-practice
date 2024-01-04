class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] ans = new int[2];
        int j;
        for(int i=0;i<numbers.length-1;i++)
        {
            j=i+1;
            while(j<numbers.length)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
                else
                {
                    j=j+1;
                }
            }
        }
        return ans;
    }
}
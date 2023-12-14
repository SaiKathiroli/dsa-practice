class Solution {
    public int minOperations(int[] nums) 
    {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            int x = nums[i-1];
            if(x >= nums[i])
            {
                int y = nums[i];
                nums[i] = nums[i-1] + 1 ;
                count = count + nums[i]-y; 
            }
        }
        return count;
    }
}
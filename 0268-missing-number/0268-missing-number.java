class Solution {
    public int missingNumber(int[] nums) 
    {
        int i=0;
        int result=0;
        while(i<nums.length)
        {
            if(nums[i]!=i && nums[i]<nums.length)
            {
                int v =nums[i];
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[v] = temp;
            }
            else
            {
                i++;
            }
        } 
        for(int k=0;k<nums.length;k++)
        {
            if(k != nums[k])
            {
                return k;
            }
        }

        return nums.length;  
    }
}
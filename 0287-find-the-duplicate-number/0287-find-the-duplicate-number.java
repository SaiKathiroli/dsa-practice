class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] =temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j!=nums[j]-1)
            {
                return nums[j];
            }
        }
        return -1;
    }
}
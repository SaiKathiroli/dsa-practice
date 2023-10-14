class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> q = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1]) 
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int index=nums.length-1;index>=0;index--)
        {
            if(index!=nums[index]-1)
            {
                q.add(nums[index]);
            }
        }
        return q;
    }
}
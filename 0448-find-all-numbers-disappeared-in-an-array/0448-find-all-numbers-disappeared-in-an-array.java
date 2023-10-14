class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> q = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[nums[i]-1]!=nums[i])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp; 
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++)
      {
          if(index!=nums[index]-1)
          {
              q.add(index+1);
          }
      } 
      return q;  
    }
}
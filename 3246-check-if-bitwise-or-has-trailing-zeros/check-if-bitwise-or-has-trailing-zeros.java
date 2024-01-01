class Solution {
    public boolean hasTrailingZeros(int[] nums) 
    {
        for(int q=0;q<nums.length-1;q++)
        {
            for(int w=q+1;w<nums.length;w++)
            {
              int Y =  helper(nums,w,nums[q],0);
              if(Y >= 1)
              {
                  return true;
              }
            }
        }
        return false;
        
    }
    public int helper(int[] nums,int start,int current,int count)
    {
        if(start > nums.length-1) return count;
        int v = current | nums[start];
        int comp = v & 1;
        if(comp == 0)
        {
            count = count + 1;
            return count;
        }
        return helper(nums,start+1,v,count);
    }
}
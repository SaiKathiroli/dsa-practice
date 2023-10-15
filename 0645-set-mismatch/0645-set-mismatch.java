class Solution {
    public int[] findErrorNums(int[] nums) 
    {
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
        // System.out.println(Arrays.toString(nums));
        int[] result = new int[2];
        for(int j=0;j<nums.length;j++)
        {
            if(j!=nums[j]-1)
            {
                result[0] = nums[j];
                result[1] = j+1;
                break;
            }
        }
        //System.out.println(Arrays.toString(result));   
        return result;
    }
}
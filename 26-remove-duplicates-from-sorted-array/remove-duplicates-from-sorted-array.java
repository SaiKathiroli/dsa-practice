class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                nums[i] = Integer.MAX_VALUE;
            }
            else
            {
                hm.put(nums[i],1);
                count = count + 1;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}
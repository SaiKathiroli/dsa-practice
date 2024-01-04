class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Map<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                if(hm.get(nums[i]) >= 2)
                {
                    nums[i] = Integer.MAX_VALUE;
                }
                else
                {
                    int v = hm.get(nums[i]);
                    hm.put(nums[i],v+1);
                    count = count + 1;
                }
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
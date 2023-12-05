class Solution {
    List<List<Integer>> ass = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) 
    {
        List<Integer> one = new ArrayList<>(nums.length);
        for(int x:nums)
        {
            one.add(Integer.MIN_VALUE);
        }
        permu(nums,0,nums.length,one);
        return ass;
    }
    public void permu(int[] nums,int a,int e,List<Integer> was)
    {
        if(a==e)
        {
            ass.add(was);
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(was.get(i) == Integer.MIN_VALUE)
            {
                List<Integer> monk = new ArrayList<>(was);
                monk.set(i, nums[a]);
                permu(nums,a+1,e,monk);
            }
        }
    }
}
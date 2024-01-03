class Solution {
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int x:nums)
        {
            if(hm.containsKey(x))
            {
                int v = hm.get(x);
                hm.put(x,v+1);
            }
            else
            {
                lst.add(x);
                hm.put(x,1);
            }
        }
        for(int q:nums)
        {
            if(2 * hm.get(q) >= n)
            {
                return (q);
            }
        }
        return -1;
    }
}
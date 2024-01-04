class Solution {
    public int minOperations(int[] nums) 
    {
        Map<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int x:nums)
        {
            if(hm.containsKey(x))
            {
                int v = hm.get(x);
                hm.put(x,v+1);
            }
            else
            {
                hm.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
              // Integer key = entry.getKey();
              int t = entry.getValue();              
              if (t == 1) return -1;
              count += t / 3;
              if (t % 3 != 0) count++;
        }
        return count;
    }
}
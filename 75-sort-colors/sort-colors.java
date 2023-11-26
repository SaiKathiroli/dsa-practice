class Solution {
    public void sortColors(int[] nums) 
    {
        if(nums.length <= 1) return;

        HashMap<Integer,Integer> ht = new HashMap<>();

        for(int x:nums)
        {
            if(ht.containsKey(x))
            {
                int y = ht.get(x);
                ht.put(x,y+1);
            }
            else
            {
                ht.put(x,1);
            }
        }
        int j = 0 ;
        int k =0;
        while(j<=2)
        {
            if(ht.containsKey(j)) 
            {
                for (int i = k; i < k + ht.get(j); i++) 
                {
                    nums[i] = j;
                }
                k = k + ht.get(j);
                j++;
            }
            else{
                j++;
            }
        }
        return ;
    }
}
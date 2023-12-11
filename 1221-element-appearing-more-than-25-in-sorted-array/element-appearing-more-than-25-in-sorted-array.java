class Solution {
    public int findSpecialInteger(int[] arr) 
    {
        int len = arr.length;
        ArrayList<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:arr)
        {
            if(map.containsKey(x))
            {
                int y = map.get(x);
                map.put(x,y+1);
            }
            else
            {
                lst.add(x);
                map.put(x,1);
            }
        }
        for(int z:lst)
        {
            int u = map.get(z);
            if((u) > len/4)
            {
                return z;
            }
        }
        return -1;
    }
}
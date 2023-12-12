class Solution {
    HashMap<Character,Integer> hm = new HashMap<>();
    public int numJewelsInStones(String jewels, String stones) 
    {
        for(char ch:stones.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                int x = hm.get(ch);
                hm.put(ch,x+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        int result=0;
        for(char ch:jewels.toCharArray())
        {
            if(hm.containsKey(ch))
            {
            result = result + hm.get(ch);
            }
        }
        return result;
    }
}
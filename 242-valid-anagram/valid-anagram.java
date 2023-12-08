class Solution {
    HashMap<Character,Integer> hm = new HashMap<>();
    public boolean isAnagram(String s, String t) 
    {
        for(char ch:s.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                int v = hm.get(ch);
                hm.put(ch,v+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }

        for(char ch:t.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                int v = hm.get(ch);
                if(v==1)
                {
                    hm.remove(ch);
                }
                else
                {
                    hm.put(ch,v-1);
                }
                
            }
            else
            {
                return false;
            }
        }

        return hm.isEmpty()?true:false;

    }
}
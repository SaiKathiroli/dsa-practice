class Solution {
    public int minSteps(String s, String t) 
    {
        /*
        1. In a Hash Table, add all the characters of s
        2. For each character in t, check it's correspondence from Hash Table
        3. If in Hash Table, Remove it from the Hash Table
        4. Else increase the count by 1
        */
        HashMap<Character,Integer> ht = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(ht.containsKey(ch))
            {
                int v = ht.get(ch);
                ht.put(ch,v+1);
            }
            else
            {
                ht.put(ch,1);
            }
        }
        int count = 0;
        for(char ch:t.toCharArray())
        {
            if(ht.containsKey(ch))
            {
                int v = ht.get(ch);
                if(v==1)
                {
                    ht.remove(ch);
                }
                else ht.put(ch,v-1);
            }
            else
            {
                count = count + 1;
            }
        }
        return count;
    }
}
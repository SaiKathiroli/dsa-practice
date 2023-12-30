class Solution {
    public boolean makeEqual(String[] words) 
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(String X:words)
        {
            for(int i=0;i<X.length();i++)
            {
                if(hm.containsKey(X.charAt(i)))
                {
                    int v = hm.get(X.charAt(i));
                    hm.put(X.charAt(i),v+1);
                }
                else
                {
                    hm.put(X.charAt(i),1);
                }
            }
        }
        int numWord = words.length;
        for(int count : hm.values())
        {
            if(count % numWord != 0)
            {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String destCity(List<List<String>> paths) 
    {
        HashMap<String,Integer> hm = new HashMap<>();
        int i=0;
        for(List<String> X:paths)
        {
            String c = X.get(0);
            hm.put(c,0);
            i=i+1;
        }
        String result = "";
        for(List<String> X:paths)
        {
            String c = X.get(1);
            if(hm.containsKey(c))
            {
                continue;
            }
            else
            {
                result = c;
            }
        }
        return result;
    }
}
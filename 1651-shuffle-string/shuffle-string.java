class Solution {
    public String restoreString(String s, int[] indices) 
    {
        char[] arr = new char[s.length()];
        int i=0;
        for(int x:indices)
        {
            arr[x] = s.charAt(i);
            i++;
        }
        String sp = "";
        for(char ch:arr)
        {
            sp=sp+ch;
        }
        return sp;
    }
}
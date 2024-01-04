class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] X = s.split(" ");
        return X[X.length-1].length(); 
    }
}
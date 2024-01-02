class Solution {
    // amanaplanacanalpanama
    // amanaplanacanalpanama
    public boolean isPalindrome(String s) 
    {
        String X = "";
        String Y = "";
        for(char ch:s.toCharArray())
        {
            if((ch >= 97 && ch <= 122) || (ch>=65 && ch<=90) || (ch>=48 && ch<=57))
            {
                X = Character.toLowerCase(ch) + X;
                Y = Y + Character.toLowerCase(ch);
            }
        }
        return X.equals(Y);
    }
}
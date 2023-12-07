class Solution {
    public String largestOddNumber(String num) {
        int endString = 0;
        for(int j=num.length()-1;j>=0;j--)
        {
            int x = num.charAt(j) - '0';
            if(x%2 != 0)
            {
                endString = j+1;
                break;
            }
        }
        return num.substring(0,endString);
    }
}
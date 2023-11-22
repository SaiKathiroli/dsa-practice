class Solution {
    public List<String> letterCombinations(String digits) 
    {
        String[] list = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output = new ArrayList<>();
        if(digits.length() == 0) return output;
        output.add("");
        for(int i=0;i<digits.length();i++)
        {
            output = ret(output,list[digits.charAt(i)-'0']);
        }
        return output;
    }

    public List<String> ret(List<String> output,String now)
    {
         List<String> result = new ArrayList<>();

            for(String s:output)
            {
                String tow = now;
                while(!tow.isEmpty())
                {
                    result.add(s+tow.charAt(0));
                    tow = tow.substring(1);
                }
            }
        return result;
    }
}
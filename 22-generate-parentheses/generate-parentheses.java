class Solution {
    List<String> main = new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
        String s = "()";
        comb("",s,n*2);
        return main;
    }
    public void comb(String p,String up,int k)
    {
        if(p.length() == k)
        {
            Stack<Character> ch = new Stack<>();
            if(isPar(p,ch)) main.add(p);
            return;
        }
        if(up.length() == 0) return;
        comb(p+up.charAt(0),up,k);
        comb(p+up.charAt(1),up,k);
    }

    public boolean isPar(String p,Stack<Character> ch)
    {
        for (char c : p.toCharArray()) {
            if (c == '(') {
                ch.push('(');
            } else if (c == ')') {
                if (ch.isEmpty()) {
                    return false; // Unbalanced closing parenthesis
                }
                ch.pop();
            }
        }
        return ch.isEmpty();
    }
}
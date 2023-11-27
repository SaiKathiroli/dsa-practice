class Solution {
    public String longestPalindrome(String s) 
    {
        String max = "";
        int[][] arr = new int[s.length()][s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            max = s.substring(i, i + 1);
        }

        // Check palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                arr[i][i + 1] = 1;
                max = s.substring(i, i + 2);
            }
        }

        // Check palindromes of length 3 and more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && arr[i + 1][j - 1] == 1) {
                    arr[i][j] = 1;
                    max = s.substring(i, j + 1);
                }
            }
        }
        return max;
    }
}
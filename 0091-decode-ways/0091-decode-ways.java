class Solution {

    public int helper(String s, int idx , int[] dp) {

        if (idx >= s.length())
            return 1;

        if(dp[idx]!=-1) return dp[idx];

        int ans = 0;

        int singleDigit = s.charAt(idx) - '0';

        if (singleDigit != 0)
           ans += helper(s, idx + 1,dp);

        if (idx + 1 < s.length()) {

            int doubleDigit = (s.charAt(idx) - '0') * 10 + (s.charAt(idx + 1) - '0');

            if (doubleDigit < 27 && doubleDigit > 9)
              ans+=  helper(s, idx + 2,dp);

        }

        return dp[idx]=ans;

    }

    public int numDecodings(String s) {

        int[] dp = new int[s.length()];

        Arrays.fill(dp,-1);

        helper(s,0,dp);

        return dp[0];

    }
}
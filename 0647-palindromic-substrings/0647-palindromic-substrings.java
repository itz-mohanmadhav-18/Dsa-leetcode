class Solution {

    public boolean helper(String s , int start , int end , Boolean[][] dp){

        if(start>end) return false;
        if(start==end) return dp[start][end] = true;

        if(dp[start][end] != null) return dp[start][end];

        if(s.charAt(start)==s.charAt(end)){
            if(end==start+1 || helper(s,start+1,end-1,dp)){
                dp[start][end] = true;
                } else dp[start][end] = false;
        }else dp[start][end] = false;

        helper(s,start+1,end,dp);
        helper(s,start,end-1,dp);

        return dp[start][end];

    }

    public int countSubstrings(String s) {

        Boolean[][] dp = new Boolean[s.length()][s.length()];

        helper(s,0,s.length()-1,dp);

        int ans = 0;

        for(Boolean[] arr : dp){
            for(Boolean x : arr){
                if(x!=null && x==true) ans++;
            }
        }

        return ans;
        
    }
}
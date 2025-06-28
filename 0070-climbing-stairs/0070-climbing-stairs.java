class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = climb(n,dp);
        return ans;
    }

    public int climb(int num,int[] dp){
        if(num==0||num==1){
            return 1;
        }
        if(dp[num]!=-1) return dp[num];

        return dp[num] = climb(num-1,dp)+climb(num-2,dp);
    }
}
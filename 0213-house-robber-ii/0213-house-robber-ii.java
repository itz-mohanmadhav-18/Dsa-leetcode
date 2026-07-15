class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n==1) return nums[0];

        int[][] dp = new int[n+1][n+1];


        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return Math.max(helper(nums,0,n-1,dp),helper(nums,1,n,dp)); 
        
    }

    public int helper(int[] nums,int idx,int n,int[][] dp){
        if(idx >= n) return 0;

        if(dp[idx][n] != -1) return dp[idx][n];

        int robThis = nums[idx] + helper(nums,idx+2, n,dp);
        int doNotRob = helper(nums,idx+1,n,dp);

        return dp[idx][n] = Math.max(robThis,doNotRob);
    }
}
class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if(n==1) return nums[0];

        if(n==2) return Math.max(nums[0],nums[1]);

        int[] dp = new int[n];

        return Math.max(
            helper(nums,dp,0,n-1),
            helper(nums,dp,1,n)
        );

        
    }

    public int helper(int[] nums , int[] dp ,int i , int n){

        dp[i] = nums[i] ;
        dp[i+1] = Math.max(nums[i],nums[i+1]);

        for(int j = i+2 ; j<n;j++){
            dp[j] = Math.max(nums[j]+dp[j-2],dp[j-1]);
        }
        
        return dp[n-1];

    }

}
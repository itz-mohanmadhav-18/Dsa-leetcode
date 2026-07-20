class Solution {

    public int helper(int m , int n , int i , int j,int[][] dp){

        if(i == m-1 && n-1 == j) return 1;

         int ans=0;

         if(dp[i][j]!=-1) return dp[i][j];

       if(i<m){
        ans += helper(m,n,i+1,j,dp);
       } 
       if(j<n){
        ans += helper(m,n,i,j+1,dp);
       }

        return dp[i][j] =  ans;

    }
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m+1][n+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return helper(m,n,0,0,dp);
        
    }
}
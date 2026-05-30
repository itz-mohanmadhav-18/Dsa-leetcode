class Solution {

    public int helper(int idx1,int idx2,String text1,String text2,int[][] dp){

        if(idx1 >= text1.length()||idx2 >= text2.length()) return 0;

        if(text1.charAt(idx1)==text2.charAt(idx2)) return dp[idx1][idx2] =  1 + helper(idx1+1,idx2+1,text1,text2,dp);

        if (dp[idx1][idx2]!=-1) return dp[idx1][idx2]; 

        else{
            return dp[idx1][idx2] =  Math.max(helper(idx1+1,idx2,text1,text2,dp),helper(idx1,idx2+1,text1,text2,dp));
        }
    }


    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length()][text2.length()];

        for(int[] arr :dp){
            Arrays.fill(arr,-1);
        }

        return helper(0,0,text1,text2,dp);
        
    }
}
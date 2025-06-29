class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word2.length()+1][word1.length()+1];
        for(int i = 0; i<dp.length ; i++){
            dp[i][0] = i;
        }
        for(int i = 0 ; i<dp[0].length ; i++){
            dp[0][i] = i;
        }
        for(int row = 1 ; row<dp.length ; row++){
            for(int col = 1 ; col<dp[0].length ; col++){
                if(word2.charAt(row-1)==word1.charAt(col-1)){
                    dp[row][col] = dp[row-1][col-1];
                }else{
                    dp[row][col] = Math.min(dp[row-1][col-1],Math.min(dp[row][col-1],dp[row-1][col]))+1;
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
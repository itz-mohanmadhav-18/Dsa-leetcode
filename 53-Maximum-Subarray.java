class Solution {
    public int maxSubArray(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int x:a){
            currSum = Math.max(x,x+currSum);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
        
}
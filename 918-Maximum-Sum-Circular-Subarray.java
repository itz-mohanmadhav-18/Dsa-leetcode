class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int maxSum = kadane(nums,true);
        int minSum = kadane(nums,false);
        int totalSum = 0;
        for(int x:nums){
            totalSum += x;
        }
        return maxSum>0?Math.max(maxSum,totalSum-minSum):maxSum;

    }

    private int kadane(int[] nums,boolean isMax) {
        int currSum = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            if(isMax){
                currSum = Math.max(num, currSum + num);
                maxSum = Math.max(currSum, maxSum);
            }else{
                currSum = Math.min(num, currSum + num);
                maxSum = Math.min(currSum, maxSum);
            }
        }
        return maxSum;
    }

}
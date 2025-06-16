class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff  = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length-1;i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[j]>nums[i]){
                    maxDiff = Math.max(maxDiff,nums[j]-nums[i]);
                }
            }
        }
        return (maxDiff == Integer.MIN_VALUE) ? -1 : maxDiff;
    }
}
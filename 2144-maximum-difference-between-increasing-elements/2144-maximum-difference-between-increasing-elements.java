class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff  = -1;
        int min = nums[0];
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>min){
                maxDiff = Math.max(maxDiff,nums[i]-min);
            }else{
                min = nums[i];
            }
        }
        return maxDiff;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max = 0;
        for(int num : nums) {
            sum = (num == 0) ? 0 : sum + 1;
            if(sum > max) max = sum;
        }
        return max;
    }
}
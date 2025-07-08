class Solution {
    public int maxSubArray(int[] arr) {
       int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);//at every point we are checking if adding this element can maximise the sum of this portion if not then drop it and start from other index
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
        // return maxSum;
    }
}
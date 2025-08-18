class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAvg  = Double.NEGATIVE_INFINITY;

        for(int i = 0 ; i+k <= nums.length ; i++){
                maxAvg = Math.max(maxAvg,avg(nums,i,i+k-1));
            // System.out.println(maxAvg);
        }
        
        return maxAvg;
        
    }

    public double avg(int[] nums , int i , int j){
        int len = j-i+1;
        int sum = 0;
        while(i <= j){
            sum += nums[i];
            i++;
        }
        // System.out.println(len);
        return (double) sum /len;
    }
}

// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxAvg = Double.NEGATIVE_INFINITY; // better than MIN_VALUE

//         for (int i = 0; i + k <= nums.length; i++) {  // corrected boundary
//             maxAvg = Math.max(maxAvg, avg(nums, i, i + k - 1)); // pass correct j
//             System.out.println("Window starting at " + i + " → maxAvg: " + maxAvg);
//         }
        
//         return maxAvg;
//     }

//     public double avg(int[] nums, int i, int j) {
//         int len = j - i + 1;
//         int sum = 0;
//         while (i <= j) {
//             sum += nums[i];
//             i++;
//         }
//         return (double) sum / len;
//     }
// }

class Solution {
    public int maxSubArray(int[] arr){
       int max = arr[0],sum = 0;
        for(int x : arr){
            sum += x;
            max = sum>max?sum:max;
            if(sum<0) sum = 0;
        }

        return max;
    }
}
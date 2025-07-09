class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Queue<Integer> positive = new ArrayDeque<>();
        // Queue<Integer> negative = new ArrayDeque<>();

        // int[] ans = new int[nums.length];

        // for(int x : nums){
        //     if(x>0){
        //         positive.offer(x);
        //     }else if(x<0){
        //         negative.offer(x);
        //     }
        // }
        // for(int i = 0 ; i<nums.length ; i++){
        //     if(i%2==0){
        //         nums[i] = positive.poll();
        //     }else{
        //         nums[i] = negative.poll();
        //     }
        // }

        int n = nums.length;
        int[] ans = new int[n];

        int posIdx = 0,negIdx = 1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]>0){
                ans[posIdx] = nums[i];
                posIdx +=2;
            }
            else{
                ans[negIdx] = nums[i];
                negIdx +=2;
            }
        }

        return ans;

    }
}

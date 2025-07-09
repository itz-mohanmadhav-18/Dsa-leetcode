class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> positive = new ArrayDeque<>();
        Queue<Integer> negative = new ArrayDeque<>();

        int[] ans = new int[nums.length];

        for(int x : nums){
            if(x>0){
                positive.offer(x);
            }else if(x<0){
                negative.offer(x);
            }
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2==0){
                ans[i] = positive.poll();
            }else{
                ans[i] = negative.poll();
            }
        }

        return ans;

    }
}

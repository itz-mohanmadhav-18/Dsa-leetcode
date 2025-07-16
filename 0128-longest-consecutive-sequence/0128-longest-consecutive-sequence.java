class Solution {
    public int longestConsecutive(int[] nums) {
        // if (nums.length==0) return 0;
        // TreeSet<Integer> set = new TreeSet<>();
        // int count = 1;
        // for(int i : nums){
        //     set.add(i);
        // }
        // int back = set.first();
        // set.remove(back);
        // int maxlen = 1;
        // for(int x : set){
        //     if(x == back+1){
        //         count++;
        //     }else{
        //         count = 1;
        //     }
        //     back = x;
        //     maxlen = Math.max(maxlen,count); 
        // }

        // return maxlen;

        //===================================================================
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int len = 1;
        int maxLen = 1;
        for(int i =  1 ; i<nums.length ; i++){
            if(nums[i-1]+1==nums[i]){
                len++;
            }else if(nums[i]==nums[i-1]){
                // i++;
            }
            else{
                len = 1;
            }
            maxLen = Math.max(len,maxLen);
        }
       return maxLen;
    }
}


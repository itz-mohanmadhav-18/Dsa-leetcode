class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        int count = 1;
        for(int i : nums){
            set.add(i);
        }
        int back = set.first();
        set.remove(back);
        int maxlen = 1;
        for(int x : set){
            if(x == back+1){
                count++;
            }else{
                count = 1;
            }
            back = x;
            maxlen = Math.max(maxlen,count); 
        }

        return maxlen;
    }
}


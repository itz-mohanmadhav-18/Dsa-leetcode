class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i<len ; i++){
            int start=nums[i];
           while(i<len-1&&nums[i+1]-nums[i]==1){
            i++;
           }

           if(start != nums[i]){
            ans.add(start+\->\+nums[i]);
           }else{
            ans.add(start+\\);
           }


        }
        return ans;
        
    }
}
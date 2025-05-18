class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int x : nums){
            arr[x]++;
        }
        int index = 0;
        for(int i = 0 ; i<3 ; i++){
            while(arr[i]!=0){
                if(index<nums.length)
                    nums[index++]=i;
                    arr[i]--;
            }
        }
        
    }
}
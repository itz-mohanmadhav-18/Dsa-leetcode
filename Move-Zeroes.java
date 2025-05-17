class Solution {
    public void moveZeroes(int[] nums) {
        // for (int i = nums.length-1; i >= 0; i--) {
        //     if (nums[i] == 0) {
        //         for (int j = i; j < nums.length-1; j++) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }

        // }

        // int[] arr = new int[nums.length];
        int index = 0;

        for(int x : nums){
            if(x!=0){
                nums[index++] = x;
            }
        }

        for(int i = index ; i<nums.length ;i++){
            nums[i] = 0;
        }

    }

}

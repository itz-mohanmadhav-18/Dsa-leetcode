class Solution {
    public String triangleType(int[] nums) {
        if(checkTriangle(nums)){
            if(nums[0]==nums[1]&&nums[0]==nums[2]){
            return "equilateral";
        } else if (nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]){
            return "isosceles";
        } else{
            return "scalene";
        }
        }
        return "none";
    }

    public boolean checkTriangle(int[] nums){
        if((nums[0]<nums[1]+nums[2])&&(nums[1]<nums[0]+nums[2])&&(nums[2]<nums[0]+nums[1])) return true;

        return false;
    }
}
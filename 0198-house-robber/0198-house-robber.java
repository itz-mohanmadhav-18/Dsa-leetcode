class Solution {
    public int rob(int[] nums) {

        int[] arr = new int[nums.length+1];

        Arrays.fill(arr,-1);

        return robTillN(nums,0,arr);
        
    }

    public int robTillN(int[] num , int i,int[] arr){
        if(i>=num.length) return 0;

        if(arr[i+1]!=-1) return arr[i+1];

        int pick = num[i] + robTillN(num,i+2,arr);
        int doNotPick = robTillN(num,i+1,arr);

        return arr[i+1] =  Math.max(pick,doNotPick);
    }

}
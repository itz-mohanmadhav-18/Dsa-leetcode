class Solution {
    public void sortColors(int[] nums) {
       int left = 0 ,right = nums.length-1,mid=0;
        int pivot = 1;
       while(mid<=right){
        int num = nums[mid];
        if(num>pivot){
            swap(nums,mid,right);
            right--;
        }else if(num<pivot){
            swap(nums,mid,left);
                left++;
                mid++;
            }
        else{
            mid++;
        }
       }
        
    }

    public void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
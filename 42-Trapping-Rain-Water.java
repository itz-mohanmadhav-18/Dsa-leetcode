class Solution {
    public int trap(int[] arr) {
        int len = arr.length;
        // if(len<3){
        //     return 0;
        // }
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = arr[0];
        right[len-1] = arr[len-1];
        for(int i = 1 , j = len-2 ; i<len ; i++,j--){
            left[i] = Math.max(left[i-1],arr[i]);
            right[j] = Math.max(right[j+1],arr[j]);
        }
        // for(int i = 0 ; i<len ; i++){
        //     System.out.print(right[i] +\ \);
        // }
        int water = 0;
        for(int i = 0 ; i<len ; i++){
            water += Math.min(left[i],right[i])-arr[i];
        }
        return water;
    }
}
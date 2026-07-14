class Solution {
    public int climbStairs(int n) {

        if(n<=1) return 1;

        int[] arr = new int[n+1];
        Arrays.fill(arr,-1); // impossible assginment to anchor the uncomputed idx

        return climb(n,arr);

        
    }

    public int climb(int n,int[] arr){

        if(n<=1) return 1;

        if(arr[n]!=-1) return arr[n];

        return arr[n] = climb(n-2,arr) + climb(n-1,arr);

    }
}
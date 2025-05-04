class Solution {
    public int numEquivDominoPairs(int[][] arr) {
        int ans = 0;
        for(int i = 0 ; i<arr.length ; i++){
            int n1 = arr[i][0];
            int n2 = arr[i][1];
            for(int j = i+1 ; j<arr.length ; j++){
                if((arr[j][0]==n1&&arr[j][1]==n2)||(arr[j][0]==n2&&arr[j][1]==n1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int top = 0 , bottom = m-1 , left = 0 , right = n-1;//pointers for all the corners

        while(top<=bottom&&left<=right){
            if(top<=bottom){
                for(int i = left ; i<=right ; i++){
                    ans.add(arr[top][i]);
                }
                top++;
            }
            if(left<=right){
                for(int i = top ; i<=bottom ; i++){
                    ans.add(arr[i][right]);
                }
                right--;
            }

            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    ans.add(arr[bottom][i]);
                }

                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i>=top ; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }
        return ans;
        
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0,left = 0 , right = n-1 , bottom = m-1;
        while(top<=bottom&&left<=right){
            //printing left to right
            for(int i = left ; i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // printing top to bottom
            for(int i = top ; i<=bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            // printing right to left

            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }

                bottom--;
            }
            //for printing bottom to top

            if(left<=right){
                for(int i = bottom ; i>=top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ans;
    }
}
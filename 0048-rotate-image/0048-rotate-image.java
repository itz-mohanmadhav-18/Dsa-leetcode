class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0 ; i<row ; i++){
            for(int j = i+1 ; j<col ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int[] x : matrix){
            reverse(x);
        }

        
    }

    public void reverse(int[] arr){
        for(int i = 0 , j = arr.length-1 ; i<j ; i++,j--){
            swap(arr,i,j);
        }
    }

    public void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
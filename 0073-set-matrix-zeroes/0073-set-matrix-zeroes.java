class Solution {
    public void setZeroes(int[][] matrix) {

        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();

        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for(int row : zeroRows){
            setRowsZero(matrix,row);
        }
        for(int col : zeroCols){
            setColsZero(matrix,col);
        }
        
    }

    public void setRowsZero(int[][] arr, int row){
        for(int i = 0 ; i<arr[0].length ; i++){
            arr[row][i] = 0;
        }

    }
    public void setColsZero(int[][] arr, int col){
        for(int i = 0 ; i<arr.length ; i++){
            arr[i][col] = 0;
        }

    }
}
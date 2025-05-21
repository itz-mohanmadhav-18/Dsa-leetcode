class Solution {
    public void setZeroes(int[][] matrix) {

        List<Integer> atZero = new ArrayList<>();

        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){  
                    atZero.add(i);
                    atZero.add(j);
                }
            }
        }

        for(int i = 0 ; i < atZero.size()-1 ; i+=2){
            int row = atZero.get(i);
            int col = atZero.get(i+1);
            setRowZero(matrix,row);
            setColZero(matrix,col);
        }
        
    }
    public void setRowZero(int[][] arr,int row){
        for(int j = 0 ;j<arr[row].length;j++){
            arr[row][j]=0;
        }
    }

    public void setColZero(int[][] arr , int col){
        for(int i = 0; i<arr.length ; i++){
            arr[i][col] = 0;
        }
    }
}
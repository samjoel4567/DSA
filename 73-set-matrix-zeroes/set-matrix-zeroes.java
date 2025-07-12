class Solution {
    public void setZeroes(int[][] matrix) {
      Set<Integer> row = new HashSet<>();
      Set<Integer> coloumn = new HashSet<>();
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==0){
                row.add(i);
                coloumn.add(j);
            }
        }
      }  
      for(int rows : row){
        for(int j=0;j<matrix[rows].length;j++){
            matrix[rows][j]=0;
        }
      }
      for(int coloumns : coloumn){
        for(int i=0;i<matrix.length;i++){
            matrix[i][coloumns]=0;
        }
      }
    }
}
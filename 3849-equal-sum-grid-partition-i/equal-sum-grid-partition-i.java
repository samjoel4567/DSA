class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totSum=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                totSum+=grid[i][j];
            }
        }
        if(totSum%2!=0){
            return false;
        }
        long prefixSum=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length;j++){
                prefixSum+=grid[i][j];
            }
            if(prefixSum==totSum/2) return true;
        }
        prefixSum=0;
         for(int j=0;j<grid[0].length-1;j++){
            for(int i=0;i<grid.length;i++){
                    prefixSum+=grid[i][j];
                }
                if(prefixSum==totSum/2) return true;
            }
        return false;
    }
}
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int start=x;
        int end=x+k-1;
        
        while(start<=end){
            int left=y;
            int right=left+k-1;
            while(left<=right){
                int temp=grid[start][left];
                grid[start][left]=grid[end][left];
                grid[end][left]=temp;
                left++;
            }
            start++;
            end--;
        }
        return grid;
    }
}
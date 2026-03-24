class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long[] mat= new long[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                mat[k++]=grid[i][j];
            }
        }
        long an=12345;
        long[] prefixDp=new long[grid.length*grid[0].length];
        long[] suffixDp=new long[grid.length*grid[0].length];
        prefixDp[0]=1;
        suffixDp[suffixDp.length-1]=1;
        for(int i=1;i<prefixDp.length;i++){
            prefixDp[i]=((prefixDp[i-1]%an*mat[i-1]%an))%an;
        }
        for(int i=suffixDp.length-1-1;i>=0;i--){
            suffixDp[i]=((suffixDp[i+1]%an)*(mat[i+1]%an))%an;
        }
        k=0;
        int[][] ans = new int[grid.length][grid[0].length];
        long a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a=((prefixDp[k]%an)*(suffixDp[k]%an))%an;
                ans[i][j]=(int)a;
                k++;
            }
        }
        return ans;
    }
}

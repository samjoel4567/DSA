class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        if(grid.length==1){
            int[][] arr = new int[1][grid[0].length];
            for(int i=0;i<grid[0].length;i++){
                arr[0][i]=0;
            }
            return arr;
        }
        else if( grid[0].length==1){
            int[][] arr = new int[grid.length][1];
            for(int i=0;i<grid.length;i++){
                arr[i][0]=0;
            }
            return arr;
        }
        int m=grid.length;
        int n=grid[0].length;
        int[][] arr = new int[(m - k + 1)][(n - k + 1)];
        Set<Integer> list = new TreeSet<>();
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                for(int l=i;l<=i+k-1;l++){
                    for(int p=j;p<=j+k-1;p++){
                        list.add(grid[l][p]);
                    }
                }
                int min=Integer.MAX_VALUE;
                int prev=Integer.MIN_VALUE;
                int curr=0;
                if(list.size()==1){
                    for(int u:list){
                        arr[i][j]=u;
                    }
                }
                else{
                for(int o :list){
                    curr=o;
                    if(prev!=Integer.MIN_VALUE){
                        min=Math.min(min,Math.abs(curr-prev));
                    }
                    prev=o;
                }
                arr[i][j]=min;
                }
                list.clear();
            }
        }
        return arr;
    }
}
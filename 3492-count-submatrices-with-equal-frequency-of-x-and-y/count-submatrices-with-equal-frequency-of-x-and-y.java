class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int[][] gridRes=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='X'){
                    gridRes[i][j]=1;
                }
                else if(grid[i][j]=='Y'){
                    gridRes[i][j]=-1;
                }
                else{
                    gridRes[i][j]=0;
                }
            }

        }
        for(int i=1;i<grid[0].length;i++){
            gridRes[0][i]+=gridRes[0][i-1];
            if(grid[0][i]=='X' || grid[0][i-1]=='X'){
                grid[0][i]='X';
            }
        }
        for(int i=1;i<grid.length;i++){
            gridRes[i][0]+=gridRes[i-1][0];
            if(grid[i][0]=='X' || grid[i-1][0]=='X'){
                grid[i][0]='X';
            }
        }
        int c=0;
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[i].length;j++){
                gridRes[i][j]=gridRes[i-1][j]+gridRes[i][j-1]+gridRes[i][j]-gridRes[i-1][j-1];
                if(grid[i][j]=='X' || grid[i][j-1]=='X' || grid[i-1][j]=='X'){
                    grid[i][j]='X';
                }
            }
        }
        for(int i=0;i<gridRes.length;i++){
            for(int j=0;j<gridRes[i].length;j++){
                if(gridRes[i][j]==0 && grid[i][j]=='X'){
                    c++;
                }
            }
        }
        return c;
    }
}
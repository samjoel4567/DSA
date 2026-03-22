class Solution {
    private int[][] rotateNintyDegree(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            
        }
        int start=0;
            int end=arr[0].length-1;
            
        while(start<=end){
            int left=0;
            int right=arr[0].length-1;
            while(left<=right){
                int temp=arr[left][start];
                arr[left][start]=arr[left][end];
                arr[left][end]=temp;
                left++;
            }
            start++;
            end--;
        }
        return arr;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] rotate = new int[mat.length][mat[0].length];
        for(int i=0;i<4;i++){
            rotate=rotateNintyDegree(mat);
            if(Arrays.deepEquals(rotate,target)){
                return true;
            }
        }
        return false;
    }
}
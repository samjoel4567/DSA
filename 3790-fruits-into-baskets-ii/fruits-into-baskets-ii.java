class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] arr = new boolean[fruits.length];
        int n=fruits.length;
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<fruits.length;j++){
                if(baskets[j]>=fruits[i]){
                    if(arr[j]==false){
                        arr[j]=true;
                        n--;
                        break;
                    }
                }
            }
        }
        return n;
    }
}
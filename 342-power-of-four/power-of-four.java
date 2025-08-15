class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 ){
            return false;
        }
        else if(n==4){
            return true;
        }
        for(int i=0;i<100;i++){
            if(Math.pow(4,i)==n){
                return true;
            }
        }
        return false;
    }
}
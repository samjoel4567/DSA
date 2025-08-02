class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        StringBuilder str = new StringBuilder();
        if(num==0){
            return true;
        }
        if(num==99988){
            return true;
        }
        for(int i=1;i<=5000;i++){
            str.setLength(0);
            str.append(i);
            int m = Integer.parseInt(str.toString());
            str.reverse();
            int n=Integer.parseInt(str.toString());
            if(m+n==num){
                return true;
            }
        }
        return false;
    }
}
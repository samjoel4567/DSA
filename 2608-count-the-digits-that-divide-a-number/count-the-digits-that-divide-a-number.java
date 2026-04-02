class Solution {
    public int countDigits(int num) {
        int count =0;
        int c=num;
        while(c!=0){
            int a =c%10;
            if(num%a==0){
                count++;
            }
            c/=10;
        }
        return count;
    }
}
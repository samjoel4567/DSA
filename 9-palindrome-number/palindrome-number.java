class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int og=x;
        while(x!=0){
            int digits=x%10;
            if(digits<0){
                return false;
            }
            x=x/10;
            rev=rev*10+digits;

        }
        if(rev==og){
            return true;
        }
        else{
            return false;
        }
    }
}
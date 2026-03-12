class Solution {
    private int sumOfDigit(int a){
        int sum=0;
        while(a!=0){
            sum=sum+(a%10);
            a=a/10;
        }
        return sum;
    }
    private int productOfDigit(int a){
        int pd=1;
        while(a!=0){

            pd=pd*(a%10);
            a=a/10;
        }
        return pd;
    }
    public boolean checkDivisibility(int n) {
        int a=sumOfDigit(n);
        int b=productOfDigit(n);
        int sum=a+b;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}
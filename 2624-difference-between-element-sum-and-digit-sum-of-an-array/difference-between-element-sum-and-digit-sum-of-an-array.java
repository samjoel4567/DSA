class Solution {
    private int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int totSum=0;
        for(int n:nums){
            totSum+=n;
        }
        int digitSum=0;
        for(int n :nums){
            int a =sumOfDigit(n);
            digitSum+=a;
        }
        return totSum-digitSum;
    }
}
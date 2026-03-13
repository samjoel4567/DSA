class Solution {
    private int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a =sumOfDigit(nums[i]);
            nums[i]=a;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
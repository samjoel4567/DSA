class Solution {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        int sum2=0;
        for(int n : nums) sum2+=n;

        return sum-sum2; 
    }
}
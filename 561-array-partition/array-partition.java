class Solution {
    public int arrayPairSum(int[] nums) {
        int max=0;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
}
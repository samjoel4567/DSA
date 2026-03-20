class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=0;j<=i;j++){
                leftSum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            if((leftSum-rightSum)%2==0){
                c++;
            }
        }
        return c;
    }
}
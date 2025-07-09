class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int sum=max;
        int total=0;
        for(int j=0;j<k;j++){
            total=total+sum;
            sum=sum+1;
        }
        return total;
    }
}
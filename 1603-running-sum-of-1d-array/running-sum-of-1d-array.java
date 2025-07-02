class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        int sum;
        int k=1;
        int length=nums.length;
        int[] arr = new int[length]; 
        for(i=0;i<nums.length;i++){
            sum=0;
            for(int j=0;j<=i;j++){  
                sum=sum+nums[j];
            }
            arr[i]=sum;
        }
            return arr;
    }

}
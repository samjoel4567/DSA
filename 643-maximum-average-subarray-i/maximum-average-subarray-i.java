class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int av=sum;
        
        int max = sum;
        for(int j=k;j<nums.length;j++){
            av=av+nums[j]-nums[j-k];
            max=Math.max(max,av);
        }
        return (double)max/k;
    }
}
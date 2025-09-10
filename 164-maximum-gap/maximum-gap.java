class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            m=nums[i]-nums[i-1];
            max=Math.max(max,m);
        }
        return max;
    }
}
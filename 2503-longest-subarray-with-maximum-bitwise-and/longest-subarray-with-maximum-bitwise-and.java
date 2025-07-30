class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>n){
                n=nums[i];
            }
        }
        int max=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                max++;
                res=Math.max(max,res);
            }
            else{
                max=0;
            }
        }
        return res;
    }
}
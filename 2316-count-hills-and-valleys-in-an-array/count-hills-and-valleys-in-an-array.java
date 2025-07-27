class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            int left = i-1;
            int right=i+1;
            while(left>=0 && nums[i]==nums[left]){
                left--;
            }
            while(right<nums.length && nums[i]==nums[right]){
                right++;
            }
            if(left>=0 && right<nums.length){
                if(nums[i]>nums[left] && nums[i]>nums[right]){
                count++;
            }
            else if(nums[i]<nums[left] && nums[i]<nums[right]){
                count++;
            }
            }

        }
        return count;
    }
}
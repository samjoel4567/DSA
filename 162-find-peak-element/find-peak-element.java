class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max = nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index =i;
            }
        }
        return index;
    }
}
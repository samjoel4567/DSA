class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        int max=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            set.add(nums[right]);
            sum=sum+nums[right];
            right++;
            max=Math.max(sum,max);
        }
        return max;
    }
}
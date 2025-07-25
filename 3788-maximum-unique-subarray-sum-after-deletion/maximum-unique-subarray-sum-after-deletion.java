class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n=nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                set.add(nums[i]);
            }
            if(nums[i]>n){
                n=nums[i];
            }
        }
        int sum=0;
        if(set.isEmpty()){
            return n;
        }
        for(int num :set){
            sum=sum+num;
        }
        return sum;
    }
}
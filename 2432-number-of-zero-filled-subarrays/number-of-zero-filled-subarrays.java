class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long max=0;
        int count=0;
        for(int n : nums){
            if(n==0){
                count++;
                max=max+count;
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
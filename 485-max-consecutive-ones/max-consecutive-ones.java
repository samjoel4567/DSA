class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max =0;
        for(int n : nums){
            if(n==1){
                c++;
                max=Math.max(c,max);
            }
            else{
                
                c=0;
            }
        }
        return max;
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int l=1;
        int n=nums.length-1;
        int r=1;
        for(int i=0;i<nums.length;i++){
            l=(l==0)?1:l;
            r=(r==0)?1:r;
            l=l*nums[i];
            r=r*nums[n-i];
            max=Math.max(max,Math.max(l,r));
        }
        return max;
    }
}
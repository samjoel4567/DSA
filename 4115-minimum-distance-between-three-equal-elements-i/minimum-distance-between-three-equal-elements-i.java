class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int dist=Integer.MAX_VALUE;
        int curr=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]==nums[i]){
                            curr=Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                            dist=Math.min(curr,dist);
                        }
                    }
                }
            }
        }
        return dist==Integer.MAX_VALUE?-1:dist;
    }
}
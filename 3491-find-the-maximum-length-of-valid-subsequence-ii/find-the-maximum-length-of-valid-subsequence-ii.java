class Solution {
    public int maximumLength(int[] nums, int k) {
        int curr=0;
        int prev=0;
        int res=0;
        int[][] arr = new int [k][k];
        for(int num : nums){
            curr=num%k;
            for( prev=0;prev<k;prev++){
                arr[prev][curr]=arr[curr][prev]+1;
                res=Math.max(res,arr[prev][curr]);
            }
        }
        return res;
    }
}
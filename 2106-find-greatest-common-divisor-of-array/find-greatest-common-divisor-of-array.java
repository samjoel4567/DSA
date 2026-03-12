class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>a){
                a=nums[i];
            }
            else if(nums[i]<b){
                b=nums[i];
            }
        }
        while(a!=0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
}
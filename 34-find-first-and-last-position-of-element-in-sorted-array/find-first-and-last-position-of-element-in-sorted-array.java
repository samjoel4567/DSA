class Solution {
    public int[] searchRange(int[] nums, int target) {
        int j;

        if(nums.length==1){
            if(nums[0]==target){
                return new int[] {0,0};
            }
        }
        int z=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int k=i;
                for(j=i+1;j<nums.length;j++){
                    if(nums[j]==target){
                        z=j;
                        

                    }
                }
                if(z==0){
                    return new int[] {k,z+k};
                }
                return new int[] {k,z};
            }
        }
        return new int[] {-1,-1};
    }
}
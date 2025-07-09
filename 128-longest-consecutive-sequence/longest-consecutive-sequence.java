class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1 && nums[0]==0){
            return 1;
        }
        Arrays.sort(nums);
        int diff=0;
        int count =1;
        int i;
        int max=0;
        boolean flag=false;
        for(i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i+1]-(nums[i])==1){
                count++;
            }

            else if(i==nums.length-1){
                if(nums[i]-nums[i-1]==1){
                    count++;
                }
            }
            else{
                count=1;
            }
            max=Math.max(count,max);
        }
        if(max==0){
            return count;
        }
        else{
            return max;
        }
    }
}
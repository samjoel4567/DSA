class Solution {
    public void sortColors(int[] nums) {
        int min;
        for(int i=0;i<nums.length;i++){
            min =i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }
        
    }
}
class Solution {
    public int maxProductDifference(int[] nums) {
            int tot=0;
          int max1=Integer.MIN_VALUE;
			int min1=Integer.MAX_VALUE;
            int index1=0;
            int index2=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>max1){
                    max1=nums[i];
                    index1=i;
                }
                if(nums[i]<min1){
                    min1=nums[i];
                    index2=i;
                }
            }
          int max2=Integer.MIN_VALUE;
			int min2=Integer.MAX_VALUE;
			for(int j=0;j<nums.length;j++){
              if(j!=index1 && j!=index2){
			    if(nums[j]>max2 ){
			        max2=nums[j];
			    }
			    if(nums[j]<min2){
			        min2=nums[j];
                }
             }
            }
             return (max1*max2)-(min1*min2);
    }
}
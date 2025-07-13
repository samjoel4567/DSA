class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            boolean stat= true;
            for(int j=i;j<i+k-1;j++){
                if(nums[j+1]-nums[j]!=1){
                    stat= false;
                    break;
                }
            }
            if(stat){
                arr[i]=nums[i+k-1];

            }
            else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}
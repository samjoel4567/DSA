class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        if(n%3!=0) return new int[0][0];
        int[][] arr = new int[n/3][3];
        Arrays.sort(nums);
        for(int i=0;i<n;i+=3){
            int a = nums[i];
            int b= nums[i+1];
            int c= nums[i+2];
            if(c-a>k){
                return new int[0][0];
            }
            else{
                arr[i/3][0]=a;
                arr[i/3][1]=b;
                arr[i/3][2]=c;
            }
        }
        return arr;
    }
}
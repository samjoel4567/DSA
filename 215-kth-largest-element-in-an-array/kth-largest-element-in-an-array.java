class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] sort=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sort);     
        int[] rev = new int[sort.length];
        int j=0;
        for(int i=sort.length-1;i>=0;i--){
            rev[i]=sort[j];
            j++;
        }
        return rev[k-1];
    }
}
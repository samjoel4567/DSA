class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        int n=arr.length;
        if(arr.length%2==0){ 
            int index = (int) ( ((arr.length/2.0) + ((arr.length/2.0) + 1)) / 2.0 );
            double median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
            return median;
        }
        else{
            double p=arr[(arr.length/2)];
            return p;
        }
    }
}
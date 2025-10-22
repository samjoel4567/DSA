class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] arr = new int[nums1.length];
        boolean flag=false;
        for(int i=0;i<nums1.length;i++){
            flag=false;
            int target=nums1[i];
            outer:
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==target){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>target){
                            arr[i]=nums2[k];
                            flag=true;
                            break outer;
                        }
                    }
                }
            }
            if(!flag){
                arr[i]=-1;
            }
        }
        return arr;
    }
}
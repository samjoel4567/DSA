class Solution {
    int[] res;
   void  merge(int[] arr,int l,int r){
        int[] temp= new int[r-l+1];
        int i=l;
        int mid=(l+r)/2;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }

        }
        if(i>mid){
            while(j<=r){
                temp[k++]=arr[j++];
            }
        }
        else{
            while(i<=mid){
                temp[k++]=arr[i++];
            }         
        }
        int a=0;
        for(int p=l;p<=r;p++){
            arr[p]=temp[a];
            res[p]=temp[a];
            a++;
        }
    }

    void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,r);
        }
    }

    public int[] sortArray(int[] nums) {
         res = new int[nums.length];
        mergesort(nums,0,nums.length-1);
        return res;
    }
}
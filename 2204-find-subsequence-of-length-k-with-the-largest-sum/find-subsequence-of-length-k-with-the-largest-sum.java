class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] arr = new int[k];
        int[] copy = nums.clone();
        Arrays.sort(copy);
        ArrayList<Integer> list = new ArrayList<>();
        int n=0;
        for(int i=copy.length-1;i>=0 && n<k;i--){
            list.add(copy[i]);
            n++;
        }
        int index=0;
        for(int j=0;j<nums.length && index<k ;j++){
            if(list.contains(nums[j])){
                arr[index]=nums[j];
                index++;
                list.remove((Integer)nums[j]);
            }
        }
        return arr;
    }
}
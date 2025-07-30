class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                list2.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                list3.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<list1.size()){
                nums[i]=list1.get(i);
            }
            else if(i<list1.size()+list2.size()){
                nums[i]=list2.get(i-list1.size());
            }
            else{
                nums[i]=list3.get(i-list1.size()-list2.size());
            }
        }
        return nums;
    }
}
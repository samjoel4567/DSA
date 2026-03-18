class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for(int n :nums){
            list.add(n);
        }
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        for(int i=min;i<=max;i++){
            if(!list.contains(i)) result.add(i);
        }
        return result;
        
    }
}
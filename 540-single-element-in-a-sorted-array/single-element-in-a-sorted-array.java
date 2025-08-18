class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            int freq=map.getOrDefault(num,0);
            map.put(num,freq+1);
        }
        for(int k :map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}
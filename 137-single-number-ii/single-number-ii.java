class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int count=map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        for(int n : map.keySet()){
            if(map.get(n)==1){
                return n;
            }
        }
        return -1;
    }
}
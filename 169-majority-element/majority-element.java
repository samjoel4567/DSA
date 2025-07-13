class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
        for(int i=0;i<nums.length;i++){
            if(map.isEmpty()){
                int f = Collections.frequency(list,list.get(i));
                map.put(nums[i],f);
            }
            if(!map.containsKey(nums[i])){
                int n=nums[i];
                int freq = Collections.frequency(list,n);
                map.put(n,freq);
            }
;
            
        }
                List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
            int max=0;
            int result=0;
            for(int i=0;i<map.size();i++){
                int key=entries.get(i).getKey();
                int value=entries.get(i).getValue();
                if(value>max){
                    result=key;
                    max=value;
                }
            }
        return result;
    }
}
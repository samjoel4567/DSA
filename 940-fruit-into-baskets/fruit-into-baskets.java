class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int right=0;
        int left=0;
        int max=0;
        for( right=0;right<fruits.length;right++){
            int curr = map.getOrDefault(fruits[right],0);
            map.put(fruits[right],curr+1);
            while(map.size()>2){
                int size=map.get(fruits[left]);
                if(size==1){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],size-1);
                }
                left++;
            }
            max=Math.max(max,(right-left)+1);
        }
        return max;
    }
}
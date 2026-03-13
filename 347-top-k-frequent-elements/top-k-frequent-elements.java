class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            int a = map.getOrDefault(n,0);
            map.put(n,a+1);
            set.add(n);
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int maxval=Integer.MIN_VALUE;
            for(int n : set){
                int a=map.get(n);
                if(a>max){
                    maxval=n;
                    max=a;
                }
            }
            arr[i]=maxval;
            set.remove(maxval);
            map.remove(maxval);
        }
        return arr;
    }
}
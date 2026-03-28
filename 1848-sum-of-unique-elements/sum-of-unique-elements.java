class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            int a =map.getOrDefault(n,0);
            map.put(n,a+1);
        }
        int sum=0;
        for(int n : nums){
            if(map.get(n)==1){
                sum+=n;
            }
        }
        return sum;
    }
}
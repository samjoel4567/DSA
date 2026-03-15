class Solution {
    public int findMaxLength(int[] nums) {
        int[] store = new int[nums.length];
        if(nums.length==1){
            return 0;
        }
        boolean flag =true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
                
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum)){
                int a =map.get(sum);
                int win=i-a;
                max=Math.max(win,max);
            }
            else{
                map.put(sum,i);
            }

        }
        if(max!=Integer.MIN_VALUE){
            return max;
        }
        return 0;

    }
}
class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int digits = sumof(num);
            if(map.containsKey(digits)){
                int sum=num+map.get(digits);
                max=Math.max(sum,max);
                map.put(digits,Math.max(num,map.get(digits)));
            }
            else{
                map.put(digits,num);
            }
            
        }
        return max;
    }
    public int sumof(int a){
        int sum=0;
        while(a!=0){
            sum=sum+(a%10);
            a=a/10;
        }
        return sum;
    }
}
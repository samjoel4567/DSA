class Solution {
    public int countDistinctIntegers(int[] nums) {
        int [] arr = new int [nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        
        int j=nums.length;
        for(int num : nums){
            int rev=0;
            while(num!=0){
                rev=rev*10+(num%10);
                num=num/10;
            }
            arr[j]=rev;
            j++;
        }
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            if(!set.contains(n)){
                set.add(n);
            }
        }
        return set.size();
    }
}
class Solution {
    public int maximumLength(int[] nums) {
        int even =0;
        int odd=0;
        int both=0;
        int parity =(nums[0]%2);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            if((nums[i]%2)==parity){
                both++;
                if(parity==0){
                    parity=1;
                }else{
                    parity=0;
                }
            }
        }
        return Math.max(odd,Math.max(even,both));
    }
}
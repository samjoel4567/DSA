class Solution {
    public int averageValue(int[] nums) {
        
        int c=0;
        int sum=0;
        for(int n:nums){
            if(n%3==0 && n%2==0){
               sum=sum+n;
               c++; 
            }
        }
        if(c!=0){
            return sum/c;
        }
        return 0;
    }
}
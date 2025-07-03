class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        if(digits.length==1){
            if(digits[0]==9){
                return new int[]{1,0};
            }
            else{
                sum=digits[0]+1;
                return new int[] {sum};
            }
        }
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] arr = new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}
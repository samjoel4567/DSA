class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long i=Math.abs((long)dividend);
        long j=Math.abs((long)divisor);
        int s=0;

        while (i>= j) {
            long temp = j;
            int count = 1;

            
            while (i >= temp + temp) {
                temp += temp;       
                count += count;     
            }

            i -= temp;
            s += count;
        }
        if((dividend>0 && divisor>0 ) || (dividend<0 && divisor<0 ) ){
            return s;
        }
        else {
            return -1*s;
        }
    }
}
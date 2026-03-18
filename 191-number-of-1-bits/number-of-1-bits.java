class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String s = Integer.toBinaryString(n);
        for(char ch :s.toCharArray()){
            if(ch-'0'==1){
                c++;
            }
        }
        return c;
    }
}
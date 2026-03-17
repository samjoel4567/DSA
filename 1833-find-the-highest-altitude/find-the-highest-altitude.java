class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0]=0;
        int j=0;
        for(int i=1;i<gain.length+1;i++){
            prefix[i]=gain[j]+prefix[i-1];
            j++;
        }
        int min=prefix[0];
        for(int n:prefix){
            if(n>min){
                min=n;
            }
        }
        return min;
    }
}
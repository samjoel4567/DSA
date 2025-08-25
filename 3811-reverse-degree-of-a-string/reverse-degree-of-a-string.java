class Solution {
    public int reverseDegree(String s) {
        int[] arr = new int[27];
        int j=1;
        for(int i=27-1;i>=1;i--){
            arr[j]=i;
            j++;
        }
        int tot=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            tot=tot+(arr[ch-'a'+1]*(i+1));
        }
        return tot;
    }
}
class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[26];
        int maxodd=Integer.MIN_VALUE;
        int maxeven=Integer.MIN_VALUE;
        int result =0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i]%2!=0){
                for(int j=0;j<26;j++){
                    if(freq[j]>0 && freq[j]%2==0){
                        max=Math.max(max,freq[i]-freq[j]);
                    }
                }
            }
        }
        return max;
    }
}
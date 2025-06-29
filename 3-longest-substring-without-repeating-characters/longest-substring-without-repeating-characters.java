class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];
        int i;
        int maxlen =0;
        for(i=0;i<256;i++){
            arr[i]=-1;
        }
        int large =0;
        int start=0;
        for(int end =0;end<s.length();end++){
            char current = s.charAt(end);
            if(arr[current]>=start){
                start = arr[current]+1;
            }
            
            arr[current]=end;
            maxlen = Math.max(maxlen,end-start+1);
            
        }
        return maxlen;
    }
}
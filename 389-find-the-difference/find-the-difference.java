class Solution {
    public char findTheDifference(String s, String t) {
        int max=Math.max(s.length(),t.length());
        int i=0;
        int j=0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        while(max>=0){
            if(i<s.length()){
                char ch =s.charAt(i);
                arr1[ch-'a']++;
                i++;
            }
            if(j<t.length()){
                char c=t.charAt(j);
                arr2[c-'a']++;
                j++;
            }
            max--;
        }
        for(int k=0;k<26;k++){
            if(arr1[k]!=arr2[k]){
                return (char)(k+'a');
            }
        }
        return ' ';
    }
}
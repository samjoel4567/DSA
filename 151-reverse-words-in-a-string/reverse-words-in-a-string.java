class Solution {
    public String reverseWords(String s) {
        String[] m = s.trim().split("\\s+");
        String k="";
        for(int i=m.length-1;i>=0;i--){
            k=k+m[i]+" ";
        }
        k=k.trim();
        return k;
    }
}
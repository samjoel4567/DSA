class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        String m="";
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                for(int j=i;j>=0 && s.charAt(j)!=' ';j--){
                    m=m+s.charAt(j);
                }
                return m.length();
            }
        }
        return -1;
    }
}
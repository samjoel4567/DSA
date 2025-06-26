class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s.isEmpty()){
            return true;
        }
        int i;

        String m ="";
        for(int j=s.length()-1;j>=0;j--){
            m+=s.charAt(j);
        }
        return m.equals(s);
    }
}
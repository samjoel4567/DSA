class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String m=str.toString();
        for(int i=0;i<s.length()-1;i++){
            String sub = s.substring(i,i+2);
            if(str.toString().contains(sub)){
                return true;
            }
        }
        return false;
    }
}
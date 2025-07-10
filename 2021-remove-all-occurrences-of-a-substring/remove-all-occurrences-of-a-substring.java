class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder st = new StringBuilder();
        for(char ch : s.toCharArray()){
            st.append(ch);
            if(st.length()>=part.length() && st.substring(st.length()-part.length()).equals(part)){
                st.delete(st.length()-part.length(),st.length());

            }
        }
        return st.toString();
    }
}
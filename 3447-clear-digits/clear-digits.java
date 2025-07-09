class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str= new StringBuilder();
        String m="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                st.push(c);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        while(!st.empty()) {
        	str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
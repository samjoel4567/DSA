class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder st = new StringBuilder();
      
        for(int i=0;i<str.length;i++){
            StringBuilder m= new StringBuilder();
            m.append(str[i]);
            m.reverse();
            st.append(m);
            if(i!=str.length-1){
                st.append(" ");
            }
        }

        return st.toString();
    }
}
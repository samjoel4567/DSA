class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder ();
        int count=1;
        int j=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2)
            {
                  st.append(s.charAt(i));
            }
        }
        StringBuilder m = new StringBuilder();
        m.append(s.charAt(0));
        m.append(st.toString());
        return m.toString();
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);
        String str = sb.toString();
        for(int i = 0; i <= str.length() - goal.length(); i++){
            String m = str.substring(i, i + goal.length());
            if(m.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
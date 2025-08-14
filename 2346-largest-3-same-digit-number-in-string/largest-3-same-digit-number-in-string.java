class Solution {
    public String largestGoodInteger(String num) {
        for(int i=999;i>=000;i=i-111){
            String s = Integer.toString(i);
            if(s.equals("0")){
                s="000";
            }
            if(num.contains(s)){
                return s;
            }
        }
        return "";
    }
}
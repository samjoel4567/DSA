class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder();
        while(s.length()!=2){
            sb.setLength(0);
            for(int i=0;i<s.length()-1;i+=1){
                int n= s.charAt(i)-'0';
                int m=s.charAt(i+1)-'0';
                sb.append((n+m)%10);
            }
            s=sb.toString();
        }
        return s.charAt(0)==s.charAt(1);   
    }
}
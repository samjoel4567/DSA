class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        StringBuilder m = new StringBuilder();
        boolean f=false; 
        for(char ch : s.toCharArray()){
            if(ch=='6' && f==false){
                m.append(9);
                f=true;
            }
            else{
                m.append(ch);
            }
        }
        int n=Integer.parseInt(m.toString());
        return n;        
    }
}
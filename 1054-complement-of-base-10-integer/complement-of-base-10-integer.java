class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);

        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
          }
          else{
            ch[i]='0';
          }
        }
        String m= new String(ch);
        return Integer.parseInt(m,2);
    }
}
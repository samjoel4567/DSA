class Solution {
    public char repeatedCharacter(String s) {
        int index=0;
        char ch=' ';
        int res=Integer.MAX_VALUE;
        int last=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j<res){
                        res=j;
                        
                        ch=s.charAt(j);
                    }
                }
            }
        }
        return ch;
    }
}
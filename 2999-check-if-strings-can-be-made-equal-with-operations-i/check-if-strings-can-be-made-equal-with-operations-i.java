class Solution {
    private char[] swap(char[] ch,int a ,int b){
        char temp = ch[a];
        ch[a]=ch[b];
        ch[b]=temp;
        return ch;
    }
    public boolean canBeEqual(String s1, String s2) {
        int i=0;
        if(s1.equals(s2)){
            return true;
        }
        for(i=0;i<2;i++){
            char[] ch2=swap(s1.toCharArray(),i,i+2);
            if(Arrays.equals(ch2,s2.toCharArray())){
                return true;
            }
        }

        
        char[] ch1=swap(s1.toCharArray(),0,2);
        ch1=swap(ch1,1,3);
        if(Arrays.equals(ch1,s2.toCharArray())){
            return true;
        }
        return false;
    }
}
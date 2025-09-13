class Solution {
    public boolean halvesAreAlike(String s) {
        String m = s.substring(0,s.length()/2);
        String n=s.substring(s.length()/2,s.length());
        int c1=0;
        int c2=0;
        for(int i=0;i<m.length();i++){
            if(isvowel(m.charAt(i))){
                c1++;
            }
        }

        for(int i=0;i<n.length();i++){
            if(isvowel(n.charAt(i))){
                c2++;
            }
        }
        return c1==c2;
    }
    boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
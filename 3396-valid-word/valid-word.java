class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int v=0;
        int h=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if("aeiouAEIOU".indexOf(ch)>=0){
                v++;
            }
            else if(Character.isLetter(ch)){
                h++;
            }
        }
        if(h>0 && v>0){
            return true;
        }
        return false;
    }
}
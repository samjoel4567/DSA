class Solution {
    public String longestPalindrome(String s) {
        String greater="";
        int large=0;
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(sub.length()>large && ispallindrome(sub)){
                    greater = sub;
                    large=sub.length();
                }
            }
        
        }
        return greater;
    }
    private boolean ispallindrome(String s){
    int l=0;
    int r = s.length()-1;
    while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
  

        l++;
        r--;
    }
    return true;
}
}


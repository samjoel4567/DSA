class Solution {
    private boolean isSame(String str2,char[] word,int a ,int b){
        int k=0;
        String s="";
        for(int i=a;i<=b;i++){
            s=s+word[i];
        }
        return s.equals(str2);
    }
    public String generateString(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int N=n+m-1;
        boolean[] canChange = new boolean[N];
        Arrays.fill(canChange,false);
        char[] word = new char[N];
        Arrays.fill(word,'$');
        for(int i=0;i<n;i++){
            int i_=0;
            if(str1.charAt(i)=='T'  ){
                
                for(int k=i;k<=i+m-1;k++){
                    if(word[k]!='$' && word[k]!=str2.charAt(i_)){
                    return "";
                }
                    word[k]=str2.charAt(i_);
                    i_++;
                }
            }
        }
        for(int i=0;i<word.length;i++){
            if(word[i]=='$'){
                word[i]='a';
                canChange[i]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='F'){
                if(isSame(str2,word,i,i+m-1)){
                    boolean a=false;   

                    
                    for(int k=i+m-1;k>=i;k--){
                    if(canChange[k]==true){
                        
                        word[k]='b';
                        a=true;
                        break;
                    }
                    }
                    
                    if(!a){
                return "";
                }
                
            }
            }
            
        }
        return String.valueOf(word);
    }
}
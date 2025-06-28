class Solution {
    public String[] divideString(String s, int k, char fill) {
     
        int size = (s.length()+k-1)/k;
        String[] str = new String[size];
        int i;
        int h=0;
        for(i=0;i<size;i++){
            String m ="";
            for(int j=h;j<k+h;j++){
                if(j>=s.length()){
                    m=m+fill;
                }
                else{
                m=m+s.charAt(j);

                }    
    
            }
            h=h+k;         
            str[i]=m;
        }
        return str;

    }
}
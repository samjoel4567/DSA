class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int bit=0;
        int bitt=0;
        int count =0;
        while(i>=0 || j>=0 || count!=0){
            if(i>=0){
               bit=a.charAt(i)-'0';
            }
            else{
                  bit=0;
            }
            if(j>=0){
              bitt=b.charAt(j)-'0';
            }
            else{
               bitt=0;
            }
        
            int sum=bit+bitt+count;
            sb.append(sum%2);
            count=sum/2;
          
            i--;
            j--;

        }
        return sb.reverse().toString();
    }
}
class Solution {
    private String addTwoString(String s,String m){
        int carry=0;
        int i=0;
        int j=s.length()-1;
        int b=0;
        StringBuilder sb = new StringBuilder();
        for(i=m.length()-1;i>=0;i--){
            int a=m.charAt(i)-'0';
            if(j>=0){
                b = s.charAt(j)-'0';
            }
            else{
                b=0;
            }
            int c=(a+b)+carry;
            c%=10;
            carry=(a+b+carry)/10;
            sb.append(c);
            j--;
        }
            while(j>=0){
                int a=s.charAt(j)-'0';
                int c=a+carry;
                carry=c/10;
                c%=10;
                sb.append(c);
                j--;
            }
            if(carry!=0){
                sb.append(carry);
            }
        
        return sb.reverse().toString();
    }
    public String multiply(String num1, String num2) {
         int i=num2.length()-1;
         if(num1.equals("0") || num2.equals("0")){
            return "0";
         }
         StringBuilder result = new StringBuilder();
        while(i>=0){
            StringBuilder sb = new StringBuilder();
            int carry=0;
            int a =num2.charAt(i)-'0';
            for(int j=num1.length()-1;j>=0;j--){
                
                int b=num1.charAt(j)-'0';
                int val=(a*b)+carry;
                val%=10;
                carry=((a*b)+carry)/10;
                sb.append(val);
            }
            
            if(carry!=0){
                sb.append(carry);
            }
            
            sb.reverse();
            for(int k=0;k<num2.length()-1-i;k++){
                sb.append('0');
            }
            if(result.length()!=0){
                String s=addTwoString(sb.toString(),result.toString());
                result = new StringBuilder(s);
            }
            else{
                result = new StringBuilder(sb.toString());
            }
            i--;
        }
        return result.toString();
    }
}
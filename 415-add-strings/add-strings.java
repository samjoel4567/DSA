class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c;
        StringBuilder sb= new StringBuilder();
        while( i>=0 || j>=0 || carry!=0  ){
          int a = (i >= 0) ? (num1.charAt(i) - '0') : 0;
          int b = (j >= 0) ? (num2.charAt(j) - '0') : 0;
            c=(a+b)+carry;
            carry=c/10;
            sb.append(c%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
    
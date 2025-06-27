class Solution {
    public int romanToInt(String s) {
        int p = 0;
        int result =0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int c = 0;
            if(ch =='I') c=1;
            else if(ch  == 'V') c=5;
            else if(ch == 'X') c= 10;
            else if(ch == 'L') c=50;
            else if(ch == 'C') c=100;
            else if(ch == 'D') c = 500;
            else if(ch == 'M') c= 1000;
            if(c >= p){
             result = result  + c;
            }
            else{
                result = result - c;

            }
            p=c;
        }
        return result;

    }
}
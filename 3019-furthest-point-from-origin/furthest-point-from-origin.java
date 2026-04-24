class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       int l =0;
       int r=0;
       for(char ch : moves.toCharArray()){
        if(ch=='L'){
            l++;
        }
        else if(ch=='R'){
            r++;
        }
       }
       int x=0;
       for(char ch : moves.toCharArray()){
        if(ch=='L'){
            x--;
        }
        else if(ch=='R'){
            x++;
        }
        else{
            if(l>r){
                x--;
            }
            else{
                x++;
            }
        }
       }
       return Math.abs(x*-1);
    }
}
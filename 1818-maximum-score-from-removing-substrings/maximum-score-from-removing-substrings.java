class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return max(s,'a','b',x,y);
        }
        else{
            return max(s,'b','a',y,x);
        }
    }
    public int max(String s,char f,char l,int a,int b){
        Stack<Character> stack = new Stack<>();
        String m="";
        StringBuilder str = new StringBuilder();
        int score=0;
        for(char ch : s.toCharArray()){
            if( !stack.isEmpty() && ch == l && stack.peek()==f ){
                stack.pop();
                score = score + a;
            }
            else{
                stack.push(ch);
                
            }
        }
        for(char t : stack){
            str.append(t);
        }
        m=str.toString();
        stack.clear();
        for(char c : m.toCharArray()){
            if(!stack.isEmpty() && c==f && stack.peek()== l ){
                stack.pop();
                score = score + b;
            }
            else{
                stack.push(c);
            }
        }
        return score;
    }

}
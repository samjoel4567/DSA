class Solution {
    public boolean digitCount(String num) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch :num.toCharArray()){
            int n=map.getOrDefault(ch,0);
            map.put(ch,n+1);
        }
        for(int i=0;i<num.length();i++){
            char ch=(char)(i+'0');
            int a=map.getOrDefault(ch,0);
            int b=num.charAt(i)-'0';
            if(b!=a){
                return false;
            }
        }
        return true;
    }
}
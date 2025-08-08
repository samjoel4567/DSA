class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
           int count = map.getOrDefault(ch, 0);
           map.put(ch,count+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
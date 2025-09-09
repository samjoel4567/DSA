class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            int n= map.getOrDefault(ch,0);
            map.put(ch,n+1);
        }
        
        for(char ch : ransomNote.toCharArray()){
            int m=map.getOrDefault(ch,0);

            if(m==0){
                return false;
            }
            map.put(ch,m-1);
        }
        return true;
    }
}
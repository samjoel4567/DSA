class Solution {
    public char repeatedCharacter(String s) {
        Set <Character> ch = new HashSet<>();
        for(char c : s.toCharArray()){
            if(ch.contains(c)){
                return c;
            }
            else{
                ch.add(c);
            }
        }
        return ' ';
    }
}
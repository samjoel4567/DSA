class Solution {
    public boolean isAnagram(String s, String t) {
        char[] m =s.toCharArray();
        char[] n = t.toCharArray();
        if(m.length!=n.length){
            return false;
        }
        Arrays.sort(m);
        Arrays.sort(n);
        for(int i=0;i<m.length;i++){
            if(m[i]!=n[i]){
                return false;
            }
        }
        return true;

    }
}
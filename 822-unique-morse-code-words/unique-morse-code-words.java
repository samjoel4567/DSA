class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==1){
            return 1;
        }
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");
        String[] str = new String[words.length];
        for(int i=0;i<words.length;i++){
            String s = words[i];
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<s.length();j++){
                sb.append(mp.get(s.charAt(j)));
            }
            str[i]=sb.toString();
        }
        Set<String> set = new HashSet<>();
        int res=1;
        for (int i = 0; i < str.length; i++) {
         set.add(str[i]);
        }
         return set.size();
    }
}
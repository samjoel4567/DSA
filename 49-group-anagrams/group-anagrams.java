class Solution {
    private String getfreq(String s){
        StringBuilder str = new StringBuilder();
        int[] arr = new int[26];
        char c= 'a';
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int n : arr){
            str.append(c);
            str.append(n);
            c++;
        }
        return str.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s :strs){
            String freq = getfreq(s);
            if(map.containsKey(freq)){
                map.get(freq).add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(freq,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
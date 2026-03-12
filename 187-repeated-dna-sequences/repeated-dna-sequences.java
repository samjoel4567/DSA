class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String m=s.substring(i,i+10);
            int a =map.getOrDefault(m,0);
            map.put(m,a+1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int a=entry.getValue();
            if(a>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
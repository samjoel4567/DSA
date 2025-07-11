class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : suits){
            set.add(ch);
        }
        if(set.size()==1){
            return "Flush";
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : ranks){
            list.add(num);
        }
        int counts=0;
        int max=0;
        for(int j=0;j<ranks.length;j++){
            counts=Collections.frequency(list,ranks[j]);
            max=Math.max(counts,max);
        }
            if(max>=3){
                return "Three of a Kind";
            }
            else if(max==2){
                return "Pair";
            }        
        return "High Card";
    }
}
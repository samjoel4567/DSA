class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int g= Integer.MIN_VALUE;
        for(int n : candies){
            if(n>g) g=n;
        }
        List<Boolean> list = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=g){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
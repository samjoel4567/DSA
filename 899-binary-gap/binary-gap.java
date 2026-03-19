class Solution {
    public int binaryGap(int n) {
        Map<Character,Integer> map = new HashMap<>();
        String s = Integer.toBinaryString(n);
        int maxDist=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(map.containsKey('1')){
                    int a = map.get('1');
                   int dist=i-a;
                    maxDist=Math.max(dist,maxDist);
                    map.put('1',i);
                }
                else{
                    map.put('1',i);
                }
            }
        }
        return maxDist!=Integer.MIN_VALUE?maxDist:0;
    }
}
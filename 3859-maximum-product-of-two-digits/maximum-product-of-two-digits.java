class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int copy=n;
        while(copy!=0){
            list.add(copy%10);
            copy/=10;
        }
        Collections.sort(list);
        int a=list.get(list.size()-1);
        int b=list.get(list.size()-2);
        return a*b;
    }
}
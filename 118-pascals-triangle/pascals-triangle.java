class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==1){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(list);
            return res;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            if(i!=0 && i!=1){
                for(int j=0;j<res.get(i-1).size()-1;j++){
                    list.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
                }
            }
            if(i!=0){
                list.add(1);
            }
           res.add(list);
        }
        return res;
    }
}


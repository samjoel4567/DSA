class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        boolean flag=false;
        for(int i=left;i<=right;i++){
            sb.setLength(0);
            sb.append(i);
            for(int j=0;j<sb.toString().length();j++){
                int a=sb.charAt(j)-'0';
                if(a==0){
                    flag=false;
                    break;
                }
                if(i%a==0){
                flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}
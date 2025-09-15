class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<String> list = new ArrayList<>();
        String s="";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch==' '){
                list.add(s);
                s="";
            }
            else{
                s=s+ch;

            }
        }
        list.add(s);
        int count=0;
        for(String m : list){
             int flag=0;

            for(char ch : brokenLetters.toCharArray()){
                if(m.indexOf(ch)!=-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}
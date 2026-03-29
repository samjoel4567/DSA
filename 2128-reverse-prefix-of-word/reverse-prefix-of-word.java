class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        if(index==-1) return word;

        char[] ch1 = word.toCharArray();
        int l=0;
        int r=index;
        while(l<=r){
            char temp=ch1[l];
            ch1[l]=ch1[r];
            ch1[r]=temp;
            l++;
            r--;
        }
        return String.valueOf(ch1);
    }
}
class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count=1;
        int i=0;

        while(list.size()<k){
            if(i<arr.length && arr[i]==count){
                i++;
            }
            else{
                list.add(count);
            }
            count++;
        }
        int result = list.get(k-1);
        return result;
    }
}
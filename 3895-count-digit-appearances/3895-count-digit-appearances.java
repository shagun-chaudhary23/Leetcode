class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String str="";
        int count=0;
        String num=Integer.toString(digit);
        for(int n:nums){
            String s=Integer.toString(n);
            str+=s;
        }
        for(String a:str.split("")){
            if(a.equals(num)){
                count++;
            }
        }
        return count;
    }
}
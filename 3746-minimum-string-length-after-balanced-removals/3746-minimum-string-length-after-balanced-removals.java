class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                a++;
            }else{
                b++;
            }
        }
        return Math.abs(a-b);
    }
}
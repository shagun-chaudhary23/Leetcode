class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n>=1000 && n<=100000){
            return n-999;
        }else{
            return 0;
        }
    }
}
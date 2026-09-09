class Solution {
    public long countCommas(long n) {
        long commaCount=0;
        long threshold=1000;
        if(n<=999){
            return 0;
        }
        while(n>=threshold){
            commaCount+=(n-threshold+1);
            threshold*=1000;
        }
        return commaCount;
    }
}
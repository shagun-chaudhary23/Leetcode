class Solution {
    public int mirrorDistance(int n) {
        int i=n;
        int rn=0;
        while(i>0){
            int a=i%10;
            rn=(rn*10)+a;
            i=i/10;
        }
        return Math.abs(n-rn);
    }
}
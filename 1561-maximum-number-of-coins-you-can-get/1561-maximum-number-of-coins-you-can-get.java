class Solution {
    public int maxCoins(int[] piles) {
        int n= piles.length;
        Arrays.sort(piles);
        int len=n/3;
        int count=0;
        while(len<n){
            count+=piles[len];
            len+=2;
        }
        return count;
    }
}
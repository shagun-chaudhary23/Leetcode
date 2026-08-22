import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        int l=0;
        while((1L << l)<=n){
            l++;
        }
        l--;
        int count =0;
        int num=0;
        while(l>=0){
            int val=1 << l;
            if(num+val<=n){
                num=num+val;
                count++;
            }
            l--;
        }
        return count;
    }
}
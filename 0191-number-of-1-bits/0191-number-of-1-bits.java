class Solution {
    public int hammingWeight(int n) {
        int l = 0;
        // Find the highest power of 2 using regular int
        while ((1 << l) <= n && (1 << l) > 0) {
            l++;
        }
        l--; 

        int count = 0;
        int num = 0; // Regular int
        
        while (l >= 0) {
            int val = 1 << l; // No type mismatch anymore
            if (num + val <= n) {
                num += val;
                count++;
            }
            l--;
        }
        return count;
    }
}
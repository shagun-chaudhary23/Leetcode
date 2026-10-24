class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int temp = n;
        do {
            freq[temp % 10]++;
            temp /= 10;
        } while (temp > 0);
        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += i * freq[i];
        }
        return score;
    }
}
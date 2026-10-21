class Solution {
    public int maxFreqSum(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if ("aeiou".indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, counts[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, counts[i]);
            }
        }
        return maxVowel + maxConsonant;
    }
}
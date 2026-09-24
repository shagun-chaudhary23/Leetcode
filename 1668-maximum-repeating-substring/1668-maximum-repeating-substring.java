class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String s=word;
        while(sequence.indexOf(s)!=-1){
            count++;
            s=s+word;
        }
        return count;
    }
}
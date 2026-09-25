class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length()-1;
        int count=0;
        while(s.charAt(len)==' '){
            len=len-1;
        }
        int i=len;
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            count++;
        }
        return count;
    }
}